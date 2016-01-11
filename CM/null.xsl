<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
		xmlns:fo="http://www.w3.org/1999/XSL/Format"
		xmlns:d="http://docbook.org/ns/docbook"
		exclude-result-prefixes="d"
		version="1.0">
<?calenco-dep fleche.png?>

<?calenco-dep note.png?>
<?calenco-dep tip.png?>
<?calenco-dep important.png?>
<?calenco-dep warning.png?>
<?calenco-dep caution.png?>
<xsl:import href="http://docbook.sourceforge.net/release/xsl-ns/current/fo/profile-docbook.xsl" />
<xsl:import href="fo-tricks.xsl" />

<xsl:param name="fop1.extensions" select="1"></xsl:param>

<xsl:param name="local.l10n.xml" select="document('l10n-bonnet.xml')"/>

<xsl:param name="footers.on.blank.pages" select="0"></xsl:param>

<xsl:param name="double.sided" select="1" />

<xsl:param name="ulink.show" select="0"/>

<xsl:param name="email.delimiters.enabled" select="0"></xsl:param>

<xsl:param name="insert.xref.page.number">yes</xsl:param>

<xsl:param name="orderedlist.label.width">1.6em</xsl:param>
<!-- ==== Page Setup ==== -->
<xsl:param name="body.start.indent">25pt</xsl:param>

<!-- Remove blank pages -->
<xsl:template match="d:book">
  <xsl:variable name="id">
    <xsl:call-template name="object.id"/>
  </xsl:variable>

  <xsl:variable name="preamble"
                select="d:title|d:subtitle|d:titleabbrev|d:bookinfo|d:info"/>

  <xsl:variable name="content"
                select="node()[not(self::d:title or self::d:subtitle
                            or self::d:titleabbrev
                            or self::d:info
                            or self::d:bookinfo)]"/>

  <xsl:variable name="titlepage-master-reference">
    <xsl:call-template name="select.pagemaster">
      <xsl:with-param name="pageclass" select="'titlepage'"/>
    </xsl:call-template>
  </xsl:variable>

  <xsl:call-template name="front.cover"/>

  <xsl:if test="$preamble">
    <xsl:call-template name="page.sequence">
      <xsl:with-param name="master-reference"
                      select="$titlepage-master-reference"/>
      <xsl:with-param name="content">
        <fo:block id="{$id}">
          <xsl:call-template name="book.titlepage"/>
        </fo:block>
      </xsl:with-param>
    </xsl:call-template>
  </xsl:if>

  <xsl:apply-templates select="d:dedication" mode="dedication"/>
  <xsl:apply-templates select="d:acknowledgements" mode="acknowledgements"/>

  <xsl:call-template name="make.book.tocs"/>

  <xsl:apply-templates select="$content"/>

  <xsl:call-template name="back.cover"/>

</xsl:template>
<!-- Sequence of chapters are wrapped into a single page sequence. -->
<xsl:template match="d:chapter[preceding-sibling::*[1][self::d:chapter]]"/>

<xsl:template match="d:chapter[not(preceding-sibling::*[1][self::d:chapter])]">
  <xsl:variable name="id">
    <xsl:call-template name="object.id"/>
  </xsl:variable>

  <xsl:variable name="master-reference">
    <xsl:call-template name="select.pagemaster"/>
  </xsl:variable>

  <fo:page-sequence hyphenate="{$hyphenate}"
                    master-reference="{$master-reference}">
    <xsl:attribute name="language">
      <xsl:call-template name="l10n.language"/>
    </xsl:attribute>
    <xsl:attribute name="format">
      <xsl:call-template name="page.number.format">
        <xsl:with-param name="master-reference" select="$master-reference"/>
      </xsl:call-template>
    </xsl:attribute>
    <xsl:attribute name="initial-page-number">
      <xsl:call-template name="initial.page.number">
        <xsl:with-param name="master-reference" select="$master-reference"/>
      </xsl:call-template>
    </xsl:attribute>

    <xsl:attribute name="force-page-count">
      <xsl:call-template name="force.page.count">
        <xsl:with-param name="master-reference" select="$master-reference"/>
      </xsl:call-template>
    </xsl:attribute>

    <xsl:attribute name="hyphenation-character">
      <xsl:call-template name="gentext">
        <xsl:with-param name="key" select="'hyphenation-character'"/>
      </xsl:call-template>
    </xsl:attribute>
    <xsl:attribute name="hyphenation-push-character-count">
      <xsl:call-template name="gentext">
        <xsl:with-param name="key" select="'hyphenation-push-character-count'"/>
      </xsl:call-template>
    </xsl:attribute>
    <xsl:attribute name="hyphenation-remain-character-count">
      <xsl:call-template name="gentext">
        <xsl:with-param name="key" select="'hyphenation-remain-character-count'"/>
      </xsl:call-template>
    </xsl:attribute>

    <xsl:apply-templates select="." mode="running.head.mode">
      <xsl:with-param name="master-reference" select="$master-reference"/>
    </xsl:apply-templates>

    <xsl:apply-templates select="." mode="running.foot.mode">
      <xsl:with-param name="master-reference" select="$master-reference"/>
    </xsl:apply-templates>

    <fo:flow flow-name="xsl-region-body">
      <xsl:call-template name="set.flow.properties">
        <xsl:with-param name="element" select="local-name(.)"/>
        <xsl:with-param name="master-reference" select="$master-reference"/>
      </xsl:call-template>

      <fo:block id="{$id}"
                xsl:use-attribute-sets="component.titlepage.properties">
	<fo:marker marker-class-name="chapter.head.marker">
	  <xsl:apply-templates select="." mode="titleabbrev.markup">
	    <xsl:with-param name="allow-anchors" select="0"/>
	  </xsl:apply-templates>
	</fo:marker>

        <xsl:call-template name="chapter.titlepage"/>
      </fo:block>

      <xsl:variable name="toc.params">
        <xsl:call-template name="find.path.params">
          <xsl:with-param name="table" select="normalize-space($generate.toc)"/>
        </xsl:call-template>
      </xsl:variable>
      <xsl:if test="contains($toc.params, 'toc')">
        <xsl:call-template name="component.toc">
          <xsl:with-param name="toc.title.p" 
                          select="contains($toc.params, 'title')"/>
        </xsl:call-template>
        <xsl:call-template name="component.toc.separator"/>
      </xsl:if>
      <xsl:apply-templates/>
      
      <xsl:variable name="this-chapter-id" select="generate-id()"/>

      <xsl:apply-templates
	  select="following-sibling::d:chapter[preceding-sibling::*[1][self::d:chapter]
		  and
		  generate-id(preceding-sibling::d:chapter[not(preceding-sibling::*[1][self::d:chapter])][1])
		  = $this-chapter-id]"
	  mode="no-page-seq"/>
    </fo:flow>
  </fo:page-sequence>
</xsl:template>

<xsl:template match="d:chapter" mode="no-page-seq">
  <xsl:variable name="id">
    <xsl:call-template name="object.id"/>
  </xsl:variable>

  <fo:block id="{$id}" break-before="page"
            xsl:use-attribute-sets="component.titlepage.properties">
    <fo:marker marker-class-name="chapter.head.marker">
      <xsl:apply-templates select="." mode="titleabbrev.markup">
	<xsl:with-param name="allow-anchors" select="0"/>
      </xsl:apply-templates>
    </fo:marker>

    <xsl:call-template name="chapter.titlepage"/>
  </fo:block>
  
  <xsl:variable name="toc.params">
    <xsl:call-template name="find.path.params">
      <xsl:with-param name="table" select="normalize-space($generate.toc)"/>
    </xsl:call-template>
  </xsl:variable>
  <xsl:if test="contains($toc.params, 'toc')">
    <xsl:call-template name="component.toc">
      <xsl:with-param name="toc.title.p" 
                      select="contains($toc.params, 'title')"/>
    </xsl:call-template>
    <xsl:call-template name="component.toc.separator"/>
  </xsl:if>
  <xsl:apply-templates/>
</xsl:template>

<!-- No page break between list of figures, tables, etc... -->
<xsl:template name="make.book.tocs">

  <xsl:variable name="lot-master-reference">
    <xsl:call-template name="select.pagemaster">
      <xsl:with-param name="pageclass" select="'lot'"/>
    </xsl:call-template>
  </xsl:variable>

  <xsl:variable name="toc.params">
    <xsl:call-template name="find.path.params">
      <xsl:with-param name="table" select="normalize-space($generate.toc)"/>
    </xsl:call-template>
  </xsl:variable>

  <xsl:if test="contains($toc.params, 'toc')">
    <xsl:call-template name="page.sequence">
      <xsl:with-param name="master-reference"
                      select="$lot-master-reference"/>
      <xsl:with-param name="element" select="'toc'"/>
      <xsl:with-param name="gentext-key" select="'TableofContents'"/>
      <xsl:with-param name="content">
        <xsl:call-template name="division.toc">
          <xsl:with-param name="toc.title.p" 
                          select="contains($toc.params, 'title')"/>
        </xsl:call-template>
      </xsl:with-param>
    </xsl:call-template>
  </xsl:if>

  <xsl:if test=".//d:figure or .//d:table or .//d:example">
    <xsl:call-template name="page.sequence">
      <xsl:with-param name="master-reference"
                      select="$lot-master-reference"/>
      <xsl:with-param name="element" select="'toc'"/>
      <xsl:with-param name="gentext-key" select="'ListofFigures'"/>
      <xsl:with-param name="content">
	<xsl:if test="contains($toc.params,'figure') and .//d:figure">
          <xsl:call-template name="list.of.titles">
            <xsl:with-param name="titles" select="'figure'"/>
            <xsl:with-param name="nodes" select=".//d:figure"/>
          </xsl:call-template>
	</xsl:if>

	<xsl:if test="contains($toc.params,'table') and .//d:table">
          <xsl:call-template name="list.of.titles">
            <xsl:with-param name="titles" select="'table'"/>
            <xsl:with-param name="nodes" select=".//d:table[not(@tocentry = 0)]"/>
          </xsl:call-template>
	</xsl:if>

	<xsl:if test="contains($toc.params,'example') and .//d:example">
          <xsl:call-template name="list.of.titles">
            <xsl:with-param name="titles" select="'example'"/>
            <xsl:with-param name="nodes" select=".//d:example"/>
          </xsl:call-template>
	</xsl:if>

	<xsl:if test="contains($toc.params,'equation') and 
                      .//d:equation[d:title or d:info/d:title]">
          <xsl:call-template name="list.of.titles">
            <xsl:with-param name="titles" select="'equation'"/>
            <xsl:with-param name="nodes" 
                            select=".//d:equation[d:title or d:info/d:title]"/>
          </xsl:call-template>
	</xsl:if>

	<xsl:if test="contains($toc.params,'procedure') and 
                      .//d:procedure[d:title or d:info/d:title]">
          <xsl:call-template name="list.of.titles">
            <xsl:with-param name="titles" select="'procedure'"/>
            <xsl:with-param name="nodes" 
                            select=".//d:procedure[d:title or d:info/d:title]"/>
          </xsl:call-template>
	</xsl:if>
      </xsl:with-param>
    </xsl:call-template>
  </xsl:if>
</xsl:template>

<xsl:template name="list.of.titles">
  <xsl:param name="titles" select="'table'"/>
  <xsl:param name="nodes" select=".//d:table"/>
  <xsl:param name="toc-context" select="."/>

  <xsl:variable name="id">
    <xsl:call-template name="object.id"/>
  </xsl:variable>

  <xsl:if test="$nodes">
    <fo:block id="lot...{$titles}...{$id}">
      <xsl:choose>
        <xsl:when test="$titles='table'">
          <xsl:call-template name="list.of.tables.titlepage"/>
        </xsl:when>
        <xsl:when test="$titles='figure'">
          <xsl:call-template name="list.of.figures.titlepage"/>
        </xsl:when>
        <xsl:when test="$titles='equation'">
          <xsl:call-template name="list.of.equations.titlepage"/>
        </xsl:when>
        <xsl:when test="$titles='example'">
          <xsl:call-template name="list.of.examples.titlepage"/>
        </xsl:when>
        <xsl:when test="$titles='procedure'">
          <xsl:call-template name="list.of.procedures.titlepage"/>
        </xsl:when>
        <xsl:otherwise>
          <xsl:call-template name="list.of.unknowns.titlepage"/>
        </xsl:otherwise>
      </xsl:choose>

      <fo:list-block xsl:use-attribute-sets="list.block.spacing orderedlist.properties">
        <xsl:attribute name="provisional-distance-between-starts">1.6em</xsl:attribute>

	<xsl:apply-templates select="$nodes" mode="toc">
          <xsl:with-param name="toc-context" select="$toc-context"/>
	</xsl:apply-templates>
      </fo:list-block>
    </fo:block>
  </xsl:if>
</xsl:template>

<xsl:template match="d:figure|d:table|d:example|d:equation|d:procedure" mode="toc">
  <xsl:variable name="id">
    <xsl:call-template name="object.id"/>
  </xsl:variable>
  
  <fo:list-item>
    <fo:list-item-label end-indent="label-end()" xsl:use-attribute-sets="orderedlist.label.properties">
      <fo:block>
	<xsl:apply-templates select="." mode="label.markup"/>
        <xsl:value-of select="$autotoc.label.separator"/>
      </fo:block>
    </fo:list-item-label>
    <fo:list-item-body start-indent="body-start()">
      <fo:block xsl:use-attribute-sets="toc.line.properties">
	<fo:inline keep-with-next.within-line="always">
	  <fo:basic-link internal-destination="{$id}">
            <xsl:apply-templates select="." mode="titleabbrev.markup"/>
	  </fo:basic-link>
	</fo:inline>
	<fo:inline keep-together.within-line="always">
	  <xsl:text> </xsl:text>
	  <fo:leader leader-pattern="dots"
                     leader-pattern-width="3pt"
                     leader-alignment="reference-area"
                     keep-with-next.within-line="always"/>
	  <xsl:text> </xsl:text> 
	  <fo:basic-link internal-destination="{$id}">
            <fo:page-number-citation ref-id="{$id}"/>
	  </fo:basic-link>
	</fo:inline>
      </fo:block>
    </fo:list-item-body>
  </fo:list-item>
</xsl:template>

<!-- ==== Remove duplicate IDs due to content library reuse ==== -->
<xsl:template match="@xml:id" mode="profile">
  <xsl:variable name="id" select="."/>

  <xsl:if test="not(preceding::*[@xml:id=$id])">
    <xsl:copy-of select="."/>
  </xsl:if>
</xsl:template>
<!-- ==== Title Pages ====-->
<xsl:template name="book.titlepage">
  <fo:block-container position="fixed" top="0mm" left="0mm" width="{$page.width}" height="{$page.height}">
    <fo:table table-layout="fixed" height="{$page.height}" width="100%" text-align="left" display-align="center">
      <fo:table-column column-width="proportional-column-width(50)"/>
      <fo:table-column column-width="proportional-column-width(116)"/>
      <fo:table-column column-width="proportional-column-width(43)"/>
      
      <fo:table-body start-indent="0pt">	
	<fo:table-row block-progression-dimension="10mm">	  
          <fo:table-cell background-color="#007ac2" border-bottom="1pt solid #007ac2" border-right="1pt solid #007ac2">
	    <fo:block/>
	  </fo:table-cell>

	  <fo:table-cell text-align="center" number-columns-spanned="2" number-rows-spanned="3">
	    <fo:block color="#007ac2" font-size="20pt" font-weight="bold">
	      <xsl:value-of select ="/*/d:info/d:productname"/>
            </fo:block>
            <fo:block font-size="14pt">
	      <xsl:value-of select ="/*/d:info/d:productnumber"/>
            </fo:block>
          </fo:table-cell>	  
	</fo:table-row>	

	        <fo:table-row block-progression-dimension="15mm">          
          <fo:table-cell text-align="center" border-bottom="1pt solid #007ac2" border-right="1pt solid #007ac2" width="50mm">
	    <fo:block font-size="13" margin-top="1mm">
	      <xsl:value-of select ="/*/d:info/d:keywordset/d:keyword[1]"/>
	    </fo:block>
	  </fo:table-cell>
	</fo:table-row>

	        <fo:table-row block-progression-dimension="15mm">          
          <fo:table-cell text-align="center"  border-bottom="1pt solid #007ac2" border-right="1pt solid #007ac2" width="50mm">
	    <fo:block space-before="5pt" font-size="11pt" font-weight="bold">
	      <xsl:value-of select ="/*/d:info/d:keywordset/d:keyword[2]"/>
	    </fo:block>
	  </fo:table-cell>
	</fo:table-row>
        <fo:table-row block-progression-dimension="175mm">          
          <fo:table-cell  border-bottom="1pt solid #007ac2" border-right="1pt solid #007ac2">
	    <fo:block/>
	  </fo:table-cell>
	  
          <fo:table-cell text-align="center" border-top="1pt solid #007ac2" number-columns-spanned="2">
	    <fo:block font-size="0pt" margin-left="5mm"> 
	      <fo:external-graphic width="120mm" content-height="140mm" content-width="scale-to-fit">
		<xsl:variable name="filename">
		  <xsl:call-template name="mediaobject.filename">
		    <xsl:with-param name="object" select="/*/d:info/d:mediaobject/d:imageobject"/>
		  </xsl:call-template>
		</xsl:variable>
		
		<xsl:attribute name="src">
		  <xsl:call-template name="fo-external-image">
		    <xsl:with-param name="filename">
		      <xsl:if test="$img.src.path != '' and
		                    not(starts-with($filename, '/')) and
		                    not(contains($filename, '://'))">
			<xsl:value-of select="$img.src.path"/>
		      </xsl:if>
		      <xsl:value-of select="$filename"/>
		    </xsl:with-param>
		  </xsl:call-template>
		</xsl:attribute>
	      </fo:external-graphic>
	    </fo:block>
	    <fo:block space-before="19pt" space-after="5pt" font-size="16pt"
		      color="{$main.title.color}">
	      <xsl:value-of select ="/*/d:info/d:title"/> 
	    </fo:block>
	    <fo:block space-after="5pt" font-size="11pt" font-weight="bold">
	      <xsl:value-of select ="/*/d:info/d:releaseinfo"/>
	    </fo:block>
	  </fo:table-cell> 
	</fo:table-row>

	        <fo:table-row block-progression-dimension="75mm">         
          <fo:table-cell text-align="center" border-top="13pt solid #007ac2" border-right="1pt solid #007ac2" number-columns-spanned="2">
	    <fo:block>
	      <xsl:apply-templates select ="d:info/d:cover"/>
	    </fo:block>
	  </fo:table-cell>
	  
          <fo:table-cell padding-left="1em" padding-right="4mm" border-top="13pt solid #007ac2" border-left="1pt solid #007ac2">
	    <fo:block>
	      <xsl:apply-templates select="/*/d:info/d:annotation/*"/>
	    </fo:block>
	  </fo:table-cell>
	</fo:table-row>
      </fo:table-body>
    </fo:table>
  </fo:block-container>

</xsl:template>

 <xsl:template match="d:cover">
  <fo:block text-align="center">
    <xsl:apply-templates/>
  </fo:block>
</xsl:template>

<xsl:template match="d:mediaobject[ancestor::d:cover]">
  <fo:block>
    <xsl:apply-templates/> 
  </fo:block>
</xsl:template>

<xsl:template match="d:cover/d:address">
  <xsl:param name="suppress-numbers" select="'0'"/>
  
  <xsl:variable name="content">
    <xsl:choose>
      <xsl:when test="$suppress-numbers = '0'
                      and @linenumbering = 'numbered'
                      and $use.extensions != '0'
                      and $linenumbering.extension != '0'">
        <xsl:call-template name="number.rtf.lines">
          <xsl:with-param name="rtf">
            <xsl:apply-templates/>
          </xsl:with-param>
        </xsl:call-template>
      </xsl:when>
      <xsl:otherwise>
        <xsl:apply-templates/>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:variable>
  
  <fo:block xsl:use-attribute-sets="verbatim.properties"
	    text-align="center">
    <xsl:copy-of select="$content"/>
  </fo:block>
</xsl:template>

<xsl:template match="*[@role='italic']">
<fo:inline font-weight="bold" font-style="italic">
<xsl:apply-templates/>
</fo:inline>
</xsl:template>
<xsl:template name="chapter.titlepage">
  
</xsl:template>
<!-- ==== Header, Footer ==== -->
<xsl:param name="header.column.widths">1 2 1</xsl:param>
<xsl:param name="footer.column.widths">1 1 1</xsl:param>

<xsl:template name="header.content">
  <xsl:param name="pageclass" select="''"/>
  <xsl:param name="sequence" select="''"/>
  <xsl:param name="position" select="''"/>
  <xsl:param name="gentext-key" select="''"/>
  
  <fo:block>
    <xsl:if test="ancestor-or-self::d:chapter">
      <xsl:choose>
	<xsl:when test="$sequence = 'odd' or $sequence = 'first'">
	  <fo:block-container position="fixed" top="10mm" left="{$page.width} - 15mm"
			      reference-orientation="90" width="{$page.height} - 20mm">
	    <fo:block text-align="center" text-transform="uppercase" letter-spacing="0.4em"
		      color="{$chapter.title.color}" font-weight="bold" font-size="16pt">
	      <fo:retrieve-marker retrieve-class-name="chapter.head.marker"
				  retrieve-position="first-including-carryover"
				  retrieve-boundary="page-sequence"/>	      
	    </fo:block>
	  </fo:block-container>
	</xsl:when>
	<xsl:when test="$sequence != 'blank'">
	  <fo:block-container position="fixed" top="10mm" left="10mm"
			      reference-orientation="90" width="{$page.height} - 20mm">
	    <fo:block text-align="center" text-transform="uppercase" letter-spacing="0.4em"
		      color="{$chapter.title.color}" font-weight="bold" font-size="16pt">
	      <fo:retrieve-marker retrieve-class-name="chapter.head.marker"
				  retrieve-position="first-including-carryover"
				  retrieve-boundary="page-sequence"/>	      
	    </fo:block>
	  </fo:block-container>	  
	</xsl:when>
      </xsl:choose>
    </xsl:if>
    <!-- sequence can be odd, even, first, blank -->
    <!-- position can be left, center, right -->
    <xsl:choose>
      <xsl:when test="$sequence = 'blank'">
        <!-- nothing -->
      </xsl:when>
      
      <xsl:when test="$pageclass = 'titlepage'">
	
      </xsl:when>
      
      <xsl:when test="$position='left'">
        <fo:block font-size="11.5pt">
	  <xsl:value-of select ="/*/d:info/d:productnumber"/>
        </fo:block>
      </xsl:when>
      
      <xsl:when test="$position='center' and parent::d:book">
	<fo:block text-align="center" color="{$chapter.title.color}" font-weight="bold" font-size="14pt">        
	  <xsl:choose>
	    <xsl:when test="ancestor-or-self::d:chapter">
	      <fo:retrieve-marker retrieve-class-name="chapter.head.marker"
				  retrieve-position="first-including-carryover"
				  retrieve-boundary="page-sequence"/>
	    </xsl:when>
	    <xsl:otherwise>
	      <xsl:apply-templates select="."
				   mode="titleabbrev.markup"/>
	    </xsl:otherwise>
	  </xsl:choose>
	</fo:block>
      </xsl:when>
      
      <xsl:when test="$position='right'">
	<fo:external-graphic src="url({$logo})" width="37mm" content-height="15mm" content-width="scale-to-fit"/>
      </xsl:when>
    </xsl:choose>
  </fo:block>
</xsl:template>

<xsl:template name="header.table">
  <xsl:param name="pageclass" select="''"/>
  <xsl:param name="sequence" select="''"/>
  <xsl:param name="gentext-key" select="''"/>

  <xsl:template name="header.table">
  <xsl:param name="pageclass" select="''"/>
  <xsl:param name="sequence" select="''"/>
  <xsl:param name="gentext-key" select="''"/>

  <!-- default is a single table style for all headers -->
  <!-- Customize it for different page classes or sequence location -->
  <!-- Test si c'est un index -->
  <xsl:choose>
    <xsl:when test="$pageclass = 'index'">
      <xsl:attribute name="margin-{$direction.align.start}">0pt</xsl:attribute>
    </xsl:when>
  </xsl:choose>

  <!-- Définition variable -->
  <xsl:variable name="column1">
    <xsl:choose>
      <xsl:when test="$double.sided = 0">1</xsl:when>
      <xsl:when test="$sequence = 'first' or $sequence = 'odd'">1</xsl:when>
      <xsl:otherwise>3</xsl:otherwise>
    </xsl:choose>
  </xsl:variable>
  <xsl:variable name="column3">
    <xsl:choose>
      <xsl:when test="$double.sided = 0">3</xsl:when>
      <xsl:when test="$sequence = 'first' or $sequence = 'odd'">3</xsl:when>
      <xsl:otherwise>1</xsl:otherwise>
    </xsl:choose>
  </xsl:variable>
  <xsl:variable name="candidate">
    <fo:table xsl:use-attribute-sets="header.table.properties">
      <xsl:call-template name="head.sep.rule">
        <xsl:with-param name="pageclass" select="$pageclass"/>
        <xsl:with-param name="sequence" select="$sequence"/>
        <xsl:with-param name="gentext-key" select="$gentext-key"/>
      </xsl:call-template>

      <fo:table-column column-number="1">
        <xsl:attribute name="column-width">
          <xsl:text>proportional-column-width(</xsl:text>
          <xsl:call-template name="header.footer.width">
            <xsl:with-param name="location">header</xsl:with-param>
            <xsl:with-param name="position" select="$column1"/>
          </xsl:call-template>
          <xsl:text>)</xsl:text>
        </xsl:attribute>
      </fo:table-column>
      <fo:table-column column-number="2">
        <xsl:attribute name="column-width">
          <xsl:text>proportional-column-width(</xsl:text>
          <xsl:call-template name="header.footer.width">
            <xsl:with-param name="location">header</xsl:with-param>
            <xsl:with-param name="position" select="2"/>
          </xsl:call-template>
          <xsl:text>)</xsl:text>
        </xsl:attribute>
      </fo:table-column>
      <fo:table-column column-number="3">
        <xsl:attribute name="column-width">
          <xsl:text>proportional-column-width(</xsl:text>
          <xsl:call-template name="header.footer.width">
            <xsl:with-param name="location">header</xsl:with-param>
            <xsl:with-param name="position" select="$column3"/>
          </xsl:call-template>
          <xsl:text>)</xsl:text>
        </xsl:attribute>
      </fo:table-column>
      <fo:table-body>
        <fo:table-row>
          <xsl:attribute name="block-progression-dimension.minimum">
            <xsl:value-of select="$header.table.height"/>
          </xsl:attribute>
          <fo:table-cell text-align="start"
                         display-align="center">
            <xsl:if test="$fop.extensions = 0">
              <xsl:attribute name="relative-align">baseline</xsl:attribute>
            </xsl:if>
            <fo:block>
              <xsl:call-template name="header.content">
                <xsl:with-param name="pageclass" select="$pageclass"/>
                <xsl:with-param name="sequence" select="$sequence"/>
                <xsl:with-param name="position" select="$direction.align.start"/>
                <xsl:with-param name="gentext-key" select="$gentext-key"/>
              </xsl:call-template>
            </fo:block>
          </fo:table-cell>
            <xsl:if test="$fop.extensions = 0">
              <xsl:attribute name="relative-align">baseline</xsl:attribute>
            </xsl:if>
            <fo:block>
              <xsl:call-template name="header.content">
                <xsl:with-param name="pageclass" select="$pageclass"/>
                <xsl:with-param name="sequence" select="$sequence"/>
                <xsl:with-param name="position" select="'center'"/>
                <xsl:with-param name="gentext-key" select="$gentext-key"/>
              </xsl:call-template>
            </fo:block>
          </fo:table-cell>
            <xsl:if test="$fop.extensions = 0">
              <xsl:attribute name="relative-align">baseline</xsl:attribute>
            </xsl:if>
            <fo:block>
              <xsl:call-template name="header.content">
                <xsl:with-param name="pageclass" select="$pageclass"/>
                <xsl:with-param name="sequence" select="$sequence"/>
                <xsl:with-param name="position" select="$direction.align.end"/>
                <xsl:with-param name="gentext-key" select="$gentext-key"/>
              </xsl:call-template>
            </fo:block>
          </fo:table-cell>
        </fo:table-row>
      </fo:table-body>
    </fo:table>
  </xsl:variable>

  <!-- Really output a header? -->
  <!-- Mise en page -->
  <xsl:choose>
    <xsl:when test="$pageclass = 'titlepage' and $gentext-key = 'book'"
                    and $sequence='first'">"
      <!-- no, book titlepages have no headers at all -->
    </xsl:when>
    <xsl:when test="$sequence = 'blank' and $headers.on.blank.pages = 0">
      <!-- no output -->
    </xsl:when>
    <xsl:otherwise>
      <xsl:copy-of select="$candidate"/>
    </xsl:otherwise>
  </xsl:choose>
</xsl:template>

<!-- Paramètres pied de page -->
<xsl:template name="footer.content">
  <xsl:param name="pageclass" select="''"/>
  <xsl:param name="sequence" select="''"/>
  <xsl:param name="position" select="''"/>
  <xsl:param name="gentext-key" select="''"/>

  <fo:block>
    <!-- pageclass can be front, body, back -->
    <!-- sequence can be odd, even, first, blank -->
    <!-- position can be left, center, right -->
    <xsl:choose>
      <xsl:when test="$pageclass = 'titlepage'">
        <!-- nop; no footer on title pages -->
      </xsl:when>

      <xsl:when test="$double.sided = 0 and $position='right'">
        <fo:page-number/>
      </xsl:when>

      <xsl:when test="$double.sided != 0 and $sequence = 'even'"
                      and $position='left'">
        <fo:page-number/>
      </xsl:when>

      <xsl:when test="$double.sided != 0 and ($sequence = 'odd' or $sequence = 'first')"
                      and $position='right'>
        <fo:page-number/>
      </xsl:when>

      <xsl:when test="$sequence='blank'">
        <xsl:choose>
          <xsl:when test="$double.sided != 0 and $position = 'left'">
            <fo:page-number/>
          </xsl:when>
          <xsl:otherwise>
            <!-- nop -->
          </xsl:otherwise>
        </xsl:choose>
      </xsl:when>
      <xsl:otherwise>
        <!-- nop -->
      </xsl:otherwise>
    </xsl:choose>
  </fo:block>
</xsl:template>
<!-- List item -->
<xsl:attribute-set name="list.block.spacing">
  <xsl:attribute name="margin-left">
    <xsl:choose>
      <xsl:otherwise>0pt</xsl:otherwise>
    </xsl:choose>
  </xsl:attribute>
</xsl:attribute-set>

<!-- Définition variables -->
<xsl:template match="d:itemizedlist/d:listitem">
  <xsl:variable name="id"><xsl:call-template name="object.id"/></xsl:variable>

  <xsl:variable name="keep.together">
    <xsl:call-template name="pi.dbfo_keep-together"/>
  </xsl:variable>

  <xsl:variable name="item.contents">
    <fo:list-item-label end-indent="label-end()" xsl:use-attribute-sets="itemizedlist.label.properties">
      <fo:block>
        <xsl:call-template name="itemizedlist.label.markup">
          <xsl:with-param name="itemsymbol">
            <xsl:call-template name="list.itemsymbol">
              <xsl:with-param name="node" select="parent::d:itemizedlist"/>
            </xsl:call-template>
          </xsl:with-param>
        </xsl:call-template>
      </fo:block>
    </fo:list-item-label>
    <fo:list-item-body start-indent="body-start()">
      <xsl:choose>
        <!-- * work around broken passivetex list-item-body rendering -->
        <xsl:when test="$passivetex.extensions = '1'">
          <xsl:apply-templates/>
        </xsl:when>
        <xsl:otherwise>
          <fo:block>
            <xsl:apply-templates/>
          </fo:block>
        </xsl:otherwise>
      </xsl:choose>
    </fo:list-item-body>
  </xsl:variable>

  <!-- Mise en page -->
  <xsl:choose>
    <xsl:when test="parent::*/@spacing = 'compact'">
      <fo:list-item id="{$id}" xsl:use-attribute-sets="compact.list.item.spacing">
        <xsl:if test="$keep.together != ''">
          <xsl:attribute name="keep-together.within-column"><xsl:value-of
                          select="$keep.together"/></xsl:attribute>
        </xsl:if>
        <xsl:copy-of select="$item.contents"/>
      </fo:list-item>
    </xsl:when>
    <xsl:otherwise>
     <fo:list-item id="{$id}" xsl:use-attribute-sets="list.item.spacing">
        <xsl:if test="$keep.together != ''">
          <xsl:attribute name="keep-together.within-column"><xsl:value-of
                          select="$keep.together"/></xsl:attribute>
        </xsl:if>
        <xsl:copy-of select="$item.contents"/>
      </fo:list-item>
    </xsl:otherwise>
  </xsl:choose>
</xsl:template>

<!-- ==== Header, Footer ==== -->
<xsl:param name="header.rule" select="0"/>
<xsl:param name="footer.rule" select="0"/>

<!-- Paramètres sommaire -->
<!-- ==== TOC ==== -->
<xsl:param name="generate.toc">
  /appendix toc,title
  article/appendix  nop
  /article  toc,title
  book      toc,title,figure,table,example,equation
  /chapter  toc,title
  part      toc,title
  /preface  toc,title
  reference toc,title
  /sect1    toc
  /sect2    toc
  /sect3    toc
  /sect4    toc
  /sect5    toc
  /section  toc
  set       toc,title
</xsl:param>
<!-- Initialisation numéro de pages -->
<xsl:template name="initial.page.number">auto</xsl:template>
<xsl:template name="page.number.format">1</xsl:template>

<!-- Page de titre du sommaire -->
<xsl:template name="table.of.contents.titlepage.recto">
  <fo:block xsl:use-attribute-sets="table.of.contents.titlepage.recto.style" 
    <xsl:call-template name="gentext">
      <xsl:with-param name="key" select="'TableofContents'"/>
    </xsl:call-template>
  </fo:block>
</xsl:template>

<!-- Formatage du contenu -->
<xsl:attribute-set name="toc.line.properties">
  <xsl:attribute name="color">
    <xsl:choose>
    </xsl:choose>
  </xsl:attribute> 
  <xsl:attribute name="font-weight">
    <xsl:choose>
    </xsl:choose>
  </xsl:attribute> 
  <xsl:attribute name="font-size">
    <xsl:choose>
    </xsl:choose>
  </xsl:attribute> 
  <xsl:attribute name="keep-with-previous.within-column">
    <xsl:choose>
      <xsl:when test="ancestor::d:section">always</xsl:when>
      <xsl:otherwise>auto</xsl:otherwise>
    </xsl:choose>
  </xsl:attribute>
</xsl:attribute-set>

<!-- Mise en page -->
<xsl:template name="toc.line">
  <xsl:param name="toc-context" select="NOTANODE"/>

  <xsl:variable name="id">
    <xsl:call-template name="object.id"/>
  </xsl:variable>

  <xsl:variable name="label">
    <xsl:apply-templates select="." mode="label.markup"/>
  </xsl:variable>
 
  <xsl:choose>
    <xsl:when test="self::d:chapter">
	<fo:basic-link internal-destination="{$id}">
          <xsl:apply-templates select="." mode="titleabbrev.markup"/>
	</fo:basic-link>
      </fo:block> 
    </xsl:when>

    <xsl:otherwise>
      <fo:block xsl:use-attribute-sets="toc.line.properties">
	<fo:inline keep-with-next.within-line="always">
	  <fo:basic-link internal-destination="{$id}">
            <xsl:if test="$label != ''">
              <xsl:copy-of select="$label"/>
              <xsl:value-of select="$autotoc.label.separator"/>
            </xsl:if>
            <xsl:apply-templates select="." mode="titleabbrev.markup"/>
	  </fo:basic-link>
	</fo:inline>
	<fo:inline keep-together.within-line="always">
	  <xsl:text> </xsl:text>
	  <xsl:text> </xsl:text> 
	  <fo:basic-link internal-destination="{$id}">
            <fo:page-number-citation ref-id="{$id}"/>
	  </fo:basic-link>
	</fo:inline>
      </fo:block>
    </xsl:otherwise>
  </xsl:choose>
</xsl:template>

<!-- Intégration du formatage dans la mise en page -->
<xsl:template name="set.toc.indent">
  <xsl:param name="reldepth"/>

  <xsl:variable name="depth">
    <xsl:choose>
      <xsl:when test="$reldepth != ''">
        <xsl:value-of select="$reldepth"/>
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="count(ancestor::*)"/>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:variable>

  <xsl:choose>
    <xsl:when test="$fop.extensions != 0 or $passivetex.extensions != 0">
       <xsl:value-of select="concat($depth*$toc.indent.width, 'pt')"/>
    </xsl:when>
    <xsl:when test="parent::d:book"/>
    <xsl:otherwise>
      <xsl:value-of select="concat($toc.indent.width, 'pt')"/>
    </xsl:otherwise>
  </xsl:choose>
</xsl:template>

<!-- Page des listes -->
<xsl:template name="list.of.figures.titlepage.recto">
  <fo:block xmlns:fo="http://www.w3.org/1999/XSL/Format"
    <xsl:call-template name="gentext">
      <xsl:with-param name="key" select="'ListofFigures'"/>
    </xsl:call-template>
  </fo:block>
</xsl:template>
<xsl:template name="back.cover"> 
  <xsl:call-template name="page.sequence">
    <xsl:with-param name="master-reference">blank</xsl:with-param>
    <xsl:with-param name="content">
      <fo:block break-after="page"/>
	<fo:block>Conception documentation technique <fo:inline font-weight="bold">cabinet Martinez</fo:inline> Nantes - www.capmundi.com</fo:block>
      </fo:block-container>

	  <xsl:apply-templates select ="d:info/d:cover"/>
	</fo:block>
      </fo:block-container>
    </xsl:with-param>
  </xsl:call-template>
</xsl:template>

<xsl:template match="d:link[ancestor::d:cover]">
    <xsl:apply-imports/>
  </fo:inline>
</xsl:template>

<!-- 
     One can go on with list.of.tables, examples, etc...
     These templates are in fo/titlepage.templates.xsl file
     of the standard DocBook XSL
-->

<!-- ==== Chapter, Appendix Titles ==== -->
<!--
    See: http://www.sagehill.net/docbookxsl/TitleFontSizes.html#ChapterTitles
-->

<!-- Numérotation des titres de chapitres et annexes -->
<xsl:param name="appendix.autolabel">A</xsl:param>
<xsl:param name="chapter.autolabel" select="0"></xsl:param>

<xsl:attribute-set name="component.title.properties">
  <!-- Has priority on following templates -->
</xsl:attribute-set>

<!-- ==== Section Titles ==== -->
<xsl:param name="section.autolabel" select="0"></xsl:param>

<!-- General Properties -->
<xsl:attribute-set name="section.title.properties">

</xsl:attribute-set>

<!-- Variable et mise en page des titres de section -->
<xsl:template name="section.heading">
  <xsl:param name="level" select="1"/>
  <xsl:param name="marker" select="1"/>
  <xsl:param name="title"/>
  <xsl:param name="marker.title"/>

  <fo:block xsl:use-attribute-sets="section.title.properties">
    <xsl:if test="$marker != 0">
      <fo:marker marker-class-name="section.head.marker">
        <xsl:copy-of select="$marker.title"/>
      </fo:marker>
    </xsl:if>

    <xsl:choose>
      <xsl:when test="$level=1">
        <fo:block xsl:use-attribute-sets="section.title.level1.properties">
          <xsl:copy-of select="$title"/>
        </fo:block>
      </xsl:when>
      <xsl:when test="$level=2">
        <fo:block display-align="center" xsl:use-attribute-sets="section.title.level2.properties">
          <fo:external-graphic src="url(fleche.png)" width="9mm" content-height="4mm" content-width="7mm"/>
          <xsl:copy-of select="$title"/>
        </fo:block>
      </xsl:when>
      <xsl:when test="$level=3">
        <fo:block xsl:use-attribute-sets="section.title.level3.properties">
          <xsl:copy-of select="$title"/>
        </fo:block>
      </xsl:when>
      <xsl:when test="$level=4">
        <fo:block xsl:use-attribute-sets="section.title.level4.properties">
          <xsl:copy-of select="$title"/>
        </fo:block>
      </xsl:when>
      <xsl:when test="$level=5">
        <fo:block xsl:use-attribute-sets="section.title.level5.properties">
          <xsl:copy-of select="$title"/>
        </fo:block>
      </xsl:when>
      <xsl:otherwise>
        <fo:block xsl:use-attribute-sets="section.title.level6.properties">
          <xsl:copy-of select="$title"/>
        </fo:block>
      </xsl:otherwise>
    </xsl:choose>
  </fo:block>
</xsl:template>

<!-- Specific Level Properties -->
<xsl:attribute-set name="section.title.level1.properties">
  <xsl:attribute name="font-size">
    <xsl:value-of select="$body.font.master * 1.8"/>
    <xsl:text>pt</xsl:text>
  </xsl:attribute>
  <xsl:attribute name="color">
    <xsl:value-of select="$section.title.l1.color"/>
  </xsl:attribute>
</xsl:attribute-set>

<xsl:attribute-set name="section.title.level2.properties">
  <xsl:attribute name="font-size">
    <xsl:value-of select="$body.font.master * 1.8"/>
    <xsl:text>pt</xsl:text>
  </xsl:attribute>
  <xsl:attribute name="font-weight">normal</xsl:attribute>
  <xsl:attribute name="color">
    <xsl:value-of select="$section.title.l2.color"/>
  </xsl:attribute>
</xsl:attribute-set>

<xsl:attribute-set name="section.title.level3.properties">
  <xsl:attribute name="font-size">
    <xsl:value-of select="$body.font.master * 1.3"/>
    <xsl:text>pt</xsl:text>
  </xsl:attribute>
  <xsl:attribute name="color">
    <xsl:value-of select="$section.title.l3.color"/>
  </xsl:attribute>
</xsl:attribute-set>

<xsl:attribute-set name="section.title.level4.properties">
  <xsl:attribute name="font-size">
    <xsl:value-of select="$body.font.master * 1.1"/>
    <xsl:text>pt</xsl:text>
  </xsl:attribute>
  <xsl:attribute name="color">
    <xsl:value-of select="$section.title.l4.color"/>
  </xsl:attribute>
</xsl:attribute-set>

<xsl:attribute-set name="section.title.level5.properties">
  <xsl:attribute name="font-size">
    <xsl:value-of select="$body.font.master"/>
    <xsl:text>pt</xsl:text>
    <xsl:attribute name="color">
      <xsl:value-of select="$section.title.l5.color"/>
    </xsl:attribute>
  </xsl:attribute>
</xsl:attribute-set>

<xsl:attribute-set name="section.title.level6.properties">
  <xsl:attribute name="font-size">
    <xsl:value-of select="$body.font.master"/>
    <xsl:text>pt</xsl:text>
  </xsl:attribute>
  <xsl:attribute name="color">
    <xsl:value-of select="$section.title.l6.color"/>
  </xsl:attribute>
</xsl:attribute-set>
      <fo:table-body start-indent="0pt">	
       <xsl:variable name="pgwide"> 
    <xsl:choose>
      <xsl:when test="@pgwide"> 
        <xsl:value-of select="@pgwide"/> 
      </xsl:when>
      <xsl:when test="$pgwide.pi">
        <xsl:value-of select="$pgwide.pi"/>
      </xsl:when>
      <!-- child element may set pgwide -->
      <xsl:when test="*[@pgwide]">
        <xsl:value-of select="*[@pgwide][1]/@pgwide"/>
      </xsl:when>
    </xsl:choose>
  </xsl:variable>
  <!-- TAILLE DE LA PAGE, DEFINITION DES DIMENSIONS DE LA PAGE --> 
  <xsl:choose> 
    <xsl:when test="$pgwide = '1'">
      <fo:block id="{$id}" xsl:use-attribute-sets="pgwide.properties informalfigure.properties">
        <xsl:if test="$keep.together != ''"> 
          <xsl:attribute name="keep-together.within-column"> 
	    <xsl:value-of select="$keep.together"/> 
	  </xsl:attribute> 
       </xsl:if>
   
	<xsl:call-template name="side-by-side"/> 
     </fo:block> 
  </xsl:when> 
    <xsl:otherwise> 
      <fo:block id="{$id}" 
                xsl:use-attribute-sets="informalfigure.properties">
        <xsl:if test="$keep.together != ''">
          <xsl:attribute name="keep-together.within-column">
	    <xsl:value-of select="$keep.together"/>
	  </xsl:attribute>
        </xsl:if>

	<xsl:call-template name="side-by-side"/>
      </fo:block>
    </xsl:otherwise>
  </xsl:choose>
</xsl:template>

<xsl:template name="side-by-side">
  <fo:table table-layout="fixed" width="100%">
    <fo:table-column column-width="proportional-column-width(1)"/>
    <fo:table-column column-width="proportional-column-width(1)"/>
    
    <fo:table-body start-indent="0pt">
      <fo:table-row>
        <fo:table-cell text-align="start">
	  <fo:block>
	    <xsl:apply-templates select="*[not(self::d:mediaobject)]"/>
	  </fo:block>
	</fo:table-cell>
        <fo:table-cell text-align="end" padding-left="1em">
	  <fo:block>
	    <xsl:apply-templates select="d:mediaobject"/>
	  </fo:block>
	</fo:table-cell>
     </fo:table-row>
    </fo:table-body>
  </fo:table>
</xsl:template>

<!-- ==== Formal Titles ==== -->
<xsl:attribute-set name="formal.title.properties">
  <!-- Titles for figure, tables, example, ... -->
  <xsl:attribute name="font-size">
    <xsl:choose>
      <xsl:when test="count(ancestor::d:listitem) &gt; 0">8pt</xsl:when>
      <xsl:when test="../d:listitem">10pt</xsl:when>
      <xsl:otherwise>9pt</xsl:otherwise>
    </xsl:choose>
  </xsl:attribute>
  <xsl:attribute name="text-transform">
    <xsl:choose>
      <xsl:when test="count(ancestor::d:listitem) &gt; 0">uppercase</xsl:when>
      <xsl:otherwise>none</xsl:otherwise>
    </xsl:choose>
  </xsl:attribute>
  <xsl:attribute name="text-align">
    <xsl:choose>
      <xsl:when test="self::d:figure or self::d:table">center</xsl:when>
      <xsl:otherwise>start</xsl:otherwise>
    </xsl:choose>
  </xsl:attribute>
</xsl:attribute-set>


<!-- ==== Tables ==== -->
<!--
    Outmost borders of the table
-->
<xsl:param name="default.table.frame">all</xsl:param>
<xsl:param name="table.frame.border.thickness">0.5pt</xsl:param>
<xsl:param name="table.frame.border.style">solid</xsl:param>
<xsl:param name="table.frame.border.color">black</xsl:param>

<xsl:attribute-set name="table.cell.padding">
  <xsl:attribute name="padding-start">2pt</xsl:attribute>
  <xsl:attribute name="padding-end">2pt</xsl:attribute>
  <xsl:attribute name="padding-top">2pt</xsl:attribute>
  <xsl:attribute name="padding-bottom">2pt</xsl:attribute>
</xsl:attribute-set>

<!--
    Cell Borders (see configurator)
-->
<xsl:template name="border">
  <xsl:param name="side" select="'start'"/>

  <xsl:attribute name="border-{$side}-width">
    <xsl:value-of select="$table.cell.border.thickness"/>
  </xsl:attribute>
  <xsl:attribute name="border-{$side}-style">
    <xsl:value-of select="$table.cell.border.style"/>
  </xsl:attribute>
  <xsl:attribute name="border-{$side}-color">
    <xsl:choose>
      <xsl:when test="ancestor::d:thead">#ffffff</xsl:when>
      <xsl:otherwise>
	<xsl:value-of select="$table.cell.border.color"/>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:attribute>
</xsl:template>

<xsl:attribute-set name="table.table.properties">
  <xsl:attribute name="text-align">start</xsl:attribute>
</xsl:attribute-set>

<!-- Expand this template to add properties to any cell's block -->
<xsl:template name="table.cell.block.properties">
  <!-- highlight this entry? -->
  <xsl:if test="ancestor::d:thead or ancestor::d:tfoot">
    <xsl:attribute name="font-weight">bold</xsl:attribute>
  </xsl:if>
</xsl:template>

<!-- Often used to add a background color to table headers -->
<xsl:template name="table.row.properties">

  <xsl:variable name="row-height">
    <xsl:if test="processing-instruction('dbfo')">
      <xsl:call-template name="pi.dbfo_row-height"/>
    </xsl:if>
  </xsl:variable>

  <xsl:if test="$row-height != ''">
    <xsl:attribute name="block-progression-dimension">
      <xsl:value-of select="$row-height"/>
    </xsl:attribute>
  </xsl:if>

  <xsl:variable name="bgcolor">
    <xsl:call-template name="pi.dbfo_bgcolor"/>
  </xsl:variable>

  <xsl:choose>
    <xsl:when test="$bgcolor != ''">
      <xsl:attribute name="background-color">
	<xsl:value-of select="$bgcolor"/>
      </xsl:attribute>
    </xsl:when>
    <xsl:when test="ancestor::d:thead">
      <xsl:attribute name="background-color">black</xsl:attribute>
    </xsl:when>
  </xsl:choose>

  <!-- Keep header row with next row -->
  <xsl:if test="ancestor::d:thead">
    <xsl:attribute name="keep-with-next.within-column">always</xsl:attribute>
    <xsl:attribute name="color">white</xsl:attribute> 
    <xsl:attribute name="text-align">center</xsl:attribute>
 </xsl:if>

 <xsl:attribute name="keep-together.within-column">always</xsl:attribute>
</xsl:template>

<xsl:template name="table.cell.properties">
  <xsl:param name="bgcolor.pi" select="''"/>
  <xsl:param name="rowsep.inherit" select="1"/>
  <xsl:param name="colsep.inherit" select="1"/>
  <xsl:param name="col" select="1"/>
  <xsl:param name="valign.inherit" select="''"/>
  <xsl:param name="align.inherit" select="''"/>
  <xsl:param name="char.inherit" select="''"/>

  <xsl:choose>
    <xsl:when test="ancestor::d:tgroup">
      <xsl:choose>
	<xsl:when test="$bgcolor.pi != ''">
          <xsl:attribute name="background-color">
            <xsl:value-of select="$bgcolor.pi"/>
          </xsl:attribute>
	</xsl:when>
	<xsl:when test="@remap">
	  <xsl:variable name="bgcolor" select="normalize-space(substring-before(@remap, ';'))"/>
	  <xsl:variable name="color" select="normalize-space(substring-after(@remap, ';'))"/>

	  <xsl:if test="translate($bgcolor, '0123456789abcdefABCDEF', '%%%%%%%%%%%%%%%%%%%%%%') = '#%%%%%%'">
              <xsl:value-of select="$bgcolor"/>
            </xsl:attribute>
	  </xsl:if>

	  <xsl:if test="translate($color, '0123456789abcdefABCDEF', '%%%%%%%%%%%%%%%%%%%%%%') = '#%%%%%%'">
            <xsl:attribute name="color">
              <xsl:value-of select="$color"/>
            </xsl:attribute>
	  </xsl:if>
	</xsl:when>
      </xsl:choose>

      <xsl:if test="$rowsep.inherit &gt; 0">
        <xsl:call-template name="border">
          <xsl:with-param name="side" select="'bottom'"/>
        </xsl:call-template>
      </xsl:if>

      <xsl:if test="$colsep.inherit &gt; 0 and $col &lt; (ancestor::d:tgroup/@cols|ancestor::d:entrytbl/@cols)[last()]">
        <xsl:call-template name="border">
          <xsl:with-param name="side" select="'end'"/>
        </xsl:call-template>
      </xsl:if>

      <xsl:if test="$valign.inherit != ''">
       <xsl:attribute name="display-align">
          <xsl:choose>
            <xsl:when test="$valign.inherit='top'">before</xsl:when>
            <xsl:when test="$valign.inherit='middle'">center</xsl:when>
            <xsl:when test="$valign.inherit='bottom'">after</xsl:when>
            <xsl:otherwise>
              <xsl:message>
                <xsl:text>Unexpected valign value: </xsl:text>
                <xsl:value-of select="$valign.inherit"/>
                <xsl:text>, center used.</xsl:text>
              </xsl:message>
              <xsl:text>center</xsl:text>
            </xsl:otherwise>
          </xsl:choose>
        </xsl:attribute>
     </xsl:if>

      <xsl:choose>
        <xsl:when test="$align.inherit = 'char' and $char.inherit != ''">
          <xsl:attribute name="text-align">
            <xsl:value-of select="$char.inherit"/>
          </xsl:attribute>
        </xsl:when>
        <xsl:when test="$align.inherit != ''">
          <xsl:attribute name="text-align">
            <xsl:value-of select="$align.inherit"/>
          </xsl:attribute>
        </xsl:when>
      </xsl:choose>

    </xsl:when>
    <xsl:otherwise>
      <!-- HTML table -->
      <xsl:if test="$bgcolor.pi != ''">
        <xsl:attribute name="background-color">
          <xsl:value-of select="$bgcolor.pi"/>
        </xsl:attribute>
      </xsl:if>

      <xsl:if test="$align.inherit != ''">
        <xsl:attribute name="text-align">
          <xsl:value-of select="$align.inherit"/>
        </xsl:attribute>
      </xsl:if>

      <xsl:if test="$valign.inherit != ''">
        <xsl:attribute name="display-align">
          <xsl:choose>
            <xsl:when test="$valign.inherit='top'">before</xsl:when>
            <xsl:when test="$valign.inherit='middle'">center</xsl:when>
            <xsl:when test="$valign.inherit='bottom'">after</xsl:when>
            <xsl:otherwise>
              <xsl:message>
                <xsl:text>Unexpected valign value: </xsl:text>
                <xsl:value-of select="$valign.inherit"/>
                <xsl:text>, center used.</xsl:text>
              </xsl:message>
              <xsl:text>center</xsl:text>
            </xsl:otherwise>
          </xsl:choose>
        </xsl:attribute>
      </xsl:if>

      <xsl:call-template name="html.table.cell.rules"/>

    </xsl:otherwise>
  </xsl:choose>

</xsl:template>

<!-- ==== Admonitions ==== -->
<xsl:param name="admon.graphics" select="1"></xsl:param>
<!--
    Calenco will resolve these URIs to local ones.
-->
<xsl:param name="admon.graphics.path"></xsl:param><!-- CUSTOM -->

<xsl:param name="admon.graphics.extension">.png</xsl:param><!-- CUSTOM -->

<xsl:param name="admon.textlabel" select="0"></xsl:param>

<xsl:attribute-set name="admonition.title.properties">

</xsl:attribute-set>

<xsl:attribute-set name="admonition.properties">
  <!-- Inner Content -->
</xsl:attribute-set>

<xsl:attribute-set name="graphical.admonition.properties">
  <!-- When <xsl:param name="admon.graphics" select="1"></xsl:param> -->
  <xsl:attribute name="font-weight">bold</xsl:attribute>
</xsl:attribute-set>

<xsl:attribute-set name="nongraphical.admonition.properties">
  <!-- When <xsl:param name="admon.graphics" select="0"></xsl:param> -->
</xsl:attribute-set>

<!-- ==== Call Outs ==== -->
<!--
    Calenco will resolve these URIs to local ones.
-->
<xsl:param name="callout.graphics.path">http://docbook.sourceforge.net/release/xsl-ns/current/images/callouts/</xsl:param><!-- CUSTOM -->


<!-- ==== Lists ==== -->
<xsl:attribute-set name="list.item.spacing">
  <!-- This is almost always considered too much -->
  <xsl:attribute name="space-before.optimum">0.4em</xsl:attribute>
  <xsl:attribute name="space-before.minimum">0.3em</xsl:attribute>
  <xsl:attribute name="space-before.maximum">0.5em</xsl:attribute>
</xsl:attribute-set>

<!--
    See: http://www.sagehill.net/docbookxsl/Itemizedlists.html#DiffBulletSymbol-->
<xsl:template name="next.itemsymbol">
  <xsl:param name="itemsymbol" select="'default'"/>
  <xsl:choose>
    <!-- Change this list if you want to change the order of symbols -->
    <xsl:when test="$itemsymbol = 'disc'">circle</xsl:when>
    <xsl:when test="$itemsymbol = 'circle'">square</xsl:when>
    <xsl:otherwise>disc</xsl:otherwise>
  </xsl:choose>
</xsl:template>

<!-- ==== Verbatim (program listings, screens, ...) ==== -->
<!--
    Hyphenate program listings and screens
-->
<xsl:param name="hyphenate.verbatim" select="1" />

<!-- 
     Put in this parameter characters whose after a line break can occur.
     (the space character is included by default)
-->
<xsl:param name="hyphenate.verbatim.characters"></xsl:param>

<xsl:attribute-set name="monospace.verbatim.properties">
  <!--
      See: http://www.sagehill.net/docbookxsl/ProgramListings.html#FormatListings
  -->
</xsl:attribute-set>

<xsl:template match="*" mode="admon.graphic.width">
  <xsl:text>20pt</xsl:text>
</xsl:template>

<xsl:template name="graphical.admonition">
  <xsl:variable name="id">
    <xsl:call-template name="object.id"/>
  </xsl:variable>
  <xsl:variable name="graphic.width">
     <xsl:apply-templates select="." mode="admon.graphic.width"/>
  </xsl:variable>

  <fo:block id="{$id}"
            xsl:use-attribute-sets="graphical.admonition.properties">
    <fo:list-block provisional-distance-between-starts="{$graphic.width} + 10pt"
                    provisional-label-separation="10pt">
      <fo:list-item>
          <fo:list-item-label end-indent="label-end()">
            <fo:block>
              <fo:external-graphic width="auto" height="auto"
                                         content-width="{$graphic.width}" >
                <xsl:attribute name="src">
                  <xsl:call-template name="admon.graphic"/>
                </xsl:attribute>
              </fo:external-graphic>
            </fo:block>
          </fo:list-item-label>
          <fo:list-item-body start-indent="body-start()">
            <xsl:if test="$admon.textlabel != 0 or d:title or d:info/d:title">
              <fo:block xsl:use-attribute-sets="admonition.title.properties">
                <xsl:apply-templates select="." mode="object.title.markup">
		  <xsl:with-param name="allow-anchors" select="1"/>
		</xsl:apply-templates>
              </fo:block>
            </xsl:if>
            <fo:block xsl:use-attribute-sets="admonition.properties">
              <xsl:apply-templates/>
            </fo:block>
          </fo:list-item-body>
      </fo:list-item>
    </fo:list-block>
  </fo:block>
</xsl:template>

<!-- ==== Inline ==== -->
<xsl:attribute-set name="xref.properties">
  <xsl:attribute name="font-weight">bold</xsl:attribute>
 <xsl:attribute name="font-style">italic</xsl:attribute>
</xsl:attribute-set>

<xsl:template match="*" mode="page.citation">
<xsl:param name="id" select="'???'"/>

  <fo:basic-link internal-destination="{$id}">
    <fo:inline keep-together.within-line="always">
      <xsl:call-template name="substitute-markup">
        <xsl:with-param name="template">
          <xsl:call-template name="gentext.template">
            <xsl:with-param name="name" select="'page.citation'"/>
            <xsl:with-param name="context" select="'xref'"/>
          </xsl:call-template>
        </xsl:with-param>
     </xsl:call-template>
    </fo:inline>
 </fo:basic-link>
</xsl:template>

<!-- ==== Images ==== -->
<!-- Add border when remap="cadre" -->
<xsl:template name="process.image">
  <!-- When this template is called, the current node should be  -->
  <!-- a graphic, inlinegraphic, imagedata, or videodata. All    -->
  <!-- those elements have the same set of attributes, so we can -->
  <!-- handle them all in one place.                             -->

  <xsl:variable name="scalefit">
    <xsl:choose>
      <xsl:when test="$ignore.image.scaling != 0">0</xsl:when>
      <xsl:when test="@contentwidth">0</xsl:when>
      <xsl:when test="@contentdepth and 
                     @contentdepth != '100%'">0</xsl:when>
      <xsl:when test="@scale">0</xsl:when>
      <xsl:when test="@scalefit"><xsl:value-of select="@scalefit"/></xsl:when>
      <xsl:when test="@width or @depth">1</xsl:when>
      <xsl:when test="$default.image.width != ''">1</xsl:when>
      <xsl:otherwise>0</xsl:otherwise>
    </xsl:choose>
  </xsl:variable>

  <xsl:variable name="scale">
    <xsl:choose>
      <xsl:when test="$ignore.image.scaling != 0">0</xsl:when>
      <xsl:when test="@contentwidth or @contentdepth">1.0</xsl:when>
      <xsl:when test="@scale">
        <xsl:value-of select="@scale div 100.0"/>
      </xsl:when>
      <xsl:otherwise>1.0</xsl:otherwise>
    </xsl:choose>
  </xsl:variable>

  <xsl:variable name="filename">
    <xsl:choose>
      <xsl:when test="local-name(.) = 'graphic'
                      or local-name(.) = 'inlinegraphic'">
        <!-- handle legacy graphic and inlinegraphic by new template --> 
        <xsl:call-template name="mediaobject.filename">
          <xsl:with-param name="object" select="."/>
        </xsl:call-template>
      </xsl:when>
      <xsl:otherwise>
        <!-- imagedata, videodata, audiodata -->
        <xsl:call-template name="mediaobject.filename">
          <xsl:with-param name="object" select=".."/>
        </xsl:call-template>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:variable>

  <xsl:variable name="content-type">
    <xsl:if test="@format">
      <xsl:call-template name="graphic.format.content-type">
        <xsl:with-param name="format" select="@format"/>
      </xsl:call-template>
    </xsl:if>
  </xsl:variable>

  <xsl:variable name="bgcolor">
    <xsl:call-template name="pi.dbfo_background-color">
      <xsl:with-param name="node" select".."/>
    </xsl:call-template>
  </xsl:variable>

  <fo:external-graphic>
    <xsl:if test="@remap = 'cadre'">
      <xsl:attribute name="border">0.8pt solid black</xsl:attribute>
    </xsl:if>

    <xsl:attribute name="src">
      <xsl:call-template name="fo-external-image">
        <xsl:with-param name="filename">
          <xsl:if test="$img.src.path != '' and 
                        not(starts-with($filename, '/')) and
                        not(contains($filename, '://'))">
            <xsl:value-of select="$img.src.path"/>
          </xsl:if>
          <xsl:value-of select="$filename"/>
        </xsl:with-param>
      </xsl:call-template>
    </xsl:attribute>

    <xsl:attribute name="width">
      <xsl:choose>
        <xsl:when test="$ignore.image.scaling != 0">auto</xsl:when>
        <xsl:when test="contains(@width,'%')">
          <xsl:value-of select="@width"/>
        </xsl:when>
        <xsl:when test="@width and not(@width = '')">
          <xsl:call-template name="length-spec">
            <xsl:with-param name="length" select="@width"/>
            <xsl:with-param name="default.units" select="'px'"/>
          </xsl:call-template>
        </xsl:when>
        <xsl:when test="not(@depth) and $default.image.width != ''">
          <xsl:call-template name="length-spec">
            <xsl:with-param name="length" select="$default.image.width"/>
            <xsl:with-param name="default.units" select="'px'"/>
          </xsl:call-template>
        </xsl:when>
       <xsl:otherwise>
	  <xsl:choose>
	    <xsl:when test="ancestor-or-self::d:inlinemediaobject">auto</xsl:when>
	    <xsl:otherwise>100%</xsl:otherwise>
	  </xsl:choose>
	</xsl:otherwise>
      </xsl:choose>
    </xsl:attribute>

    <xsl:attribute name="height">
      <xsl:choose>
        <xsl:when test="$ignore.image.scaling != 0">auto</xsl:when>
        <xsl:when test="contains(@depth,'%')">
          <xsl:value-of select="@depth"/>
        </xsl:when>
        <xsl:when test="@depth">
          <xsl:call-template name="length-spec">
            <xsl:with-param name="length" select="@depth"/>
            <xsl:with-param name="default.units" select="'px'"/>
          </xsl:call-template>
        </xsl:when>
        <xsl:otherwise>auto</xsl:otherwise>
      </xsl:choose>
    </xsl:attribute>

    <xsl:attribute name="content-width">
      <xsl:choose>
        <xsl:when test="$ignore.image.scaling != 0">auto</xsl:when>
       <xsl:when test="contains(@contentwidth,'%')">
          <xsl:value-of select="@contentwidth"/>
        </xsl:when>
        <xsl:when test="@contentwidth">
          <xsl:call-template name="length-spec">
            <xsl:with-param name="length" select="@contentwidth"/>
            <xsl:with-param name="default.units" select="'px'"/>
          </xsl:call-template>
        </xsl:when>
        <xsl:when test="number($scale) != 1.0">
          <xsl:value-of select="$scale * 100"/>
          <xsl:text>%</xsl:text>
        </xsl:when>
        <xsl:when test="$scalefit = 1">scale-to-fit</xsl:when>
        <xsl:otherwise>scale-down-to-fit</xsl:otherwise>
      </xsl:choose>
    </xsl:attribute>

    <xsl:attribute name="content-height">
      <xsl:choose>
        <xsl:when test="$ignore.image.scaling != 0">auto</xsl:when>
        <xsl:when test="contains(@contentdepth,'%')">
          <xsl:value-of select="@contentdepth"/>
        </xsl:when>
        <xsl:when test="@contentdepth">
         <xsl:call-template name="length-spec">
            <xsl:with-param name="length" select="@contentdepth"/>
           <xsl:with-param name="default.units" select="'px'"/>
          </xsl:call-template>
        </xsl:when>
        <xsl:when test="number($scale) != 1.0">
          <xsl:value-of select="$scale * 100"/>
          <xsl:text>%</xsl:text>
        </xsl:when>
        <xsl:when test="$scalefit = 1">scale-to-fit</xsl:when>
        <xsl:otherwise>auto</xsl:otherwise>
      </xsl:choose>
    </xsl:attribute>

    <xsl:if test="$content-type != ''">
      <xsl:attribute name="content-type">
        <xsl:value-of select="concat('content-type:',$content-type)"/>
      </xsl:attribute>
    </xsl:if>
<!-- COULEUR DU FOND D ECRAN -->
    <xsl:if test="$bgcolor != ''">
      <xsl:attribute name="background-color">
        <xsl:value-of select="$bgcolor"/>
      </xsl:attribute>
    </xsl:if>
<!-- ALIGNEMENT DU TEXTE -->
    <xsl:if test="@align">
      <xsl:attribute name="text-align">
        <xsl:value-of select="@align"/>
      </xsl:attribute>
    </xsl:if>
<!-- ALIGNEMENT VERTICAL DU TEXTE -->
    <xsl:if test="@valign">
      <xsl:attribute name="display-align">
        <xsl:choose>
          <xsl:when test="@valign = 'top'">before</xsl:when>
          <xsl:when test="@valign = 'middle'">center</xsl:when>
          <xsl:when test="@valign = 'bottom'">after</xsl:when>
          <xsl:otherwise>auto</xsl:otherwise>
        </xsl:choose>
      </xsl:attribute>
    </xsl:if>

    <xsl:if test="ancestor-or-self::d:inlinemediaobject">
      <xsl:attribute name="alignment-baseline">middle</xsl:attribute>
    </xsl:if>
  </fo:external-graphic>
</xsl:template>


</xsl:stylesheet>
