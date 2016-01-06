package controleur;
import Vue.Menu;
/**
 *
 * @author anas
 */
public class Message {
    
    private String message;
    
    //cree le message
    public static String message(){
        String message;
        message="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
"<xsl:stylesheet xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\"\n" +
"		xmlns:fo=\"http://www.w3.org/1999/XSL/Format\"\n" +
"		xmlns:d=\"http://docbook.org/ns/docbook\"\n" +
"		exclude-result-prefixes=\"d\"\n" +
"		version=\"1.0\">\n";
        //logo.png
        message+="<?calenco-dep logo-"+Logo()+".png?>\n";//modifiable code
        //les icones
        message+="<?calenco-dep fleche.png?>\n" +
"\n" +
"<?calenco-dep note.png?>\n" +
"<?calenco-dep tip.png?>\n" +
"<?calenco-dep important.png?>\n" +
"<?calenco-dep warning.png?>\n" +
"<?calenco-dep caution.png?>\n";
        //xxx.xml
        message+="<?calenco-dep l10n-"+l10n()+".xml?>\n";//modifiable code
        //
        message+="<xsl:import href=\"http://docbook.sourceforge.net/release/xsl-ns/current/fo/profile-docbook.xsl\" />\n" +
"<xsl:import href=\"fo-tricks.xsl\" />\n" +
"\n" +
"<xsl:param name=\"fop1.extensions\" select=\"1\"></xsl:param>\n" +
"\n" +
"<xsl:param name=\"local.l10n.xml\" select=\"document('l10n-bonnet.xml')\"/>\n" +
"\n" +
"<xsl:param name=\"footers.on.blank.pages\" select=\"0\"></xsl:param>\n" +
"\n" +
"<xsl:param name=\"double.sided\" select=\"1\" />\n" +
"\n" +
"<xsl:param name=\"ulink.show\" select=\"0\"/>\n" +
"\n" +
"<xsl:param name=\"email.delimiters.enabled\" select=\"0\"></xsl:param>\n" +
"\n" +
"<xsl:param name=\"insert.xref.page.number\">yes</xsl:param>\n" +
"\n" +
"<xsl:param name=\"orderedlist.label.width\">1.6em</xsl:param>\n";
        //page setup et blank pages removal
        message+="<!-- ==== Page Setup ==== -->\n" +
"<xsl:param name=\"body.start.indent\">25pt</xsl:param>\n" +
"\n" +
"<!-- Remove blank pages -->\n" +
"<xsl:template match=\"d:book\">\n" +
"  <xsl:variable name=\"id\">\n" +
"    <xsl:call-template name=\"object.id\"/>\n" +
"  </xsl:variable>\n" +
"\n" +
"  <xsl:variable name=\"preamble\"\n" +
"                select=\"d:title|d:subtitle|d:titleabbrev|d:bookinfo|d:info\"/>\n" +
"\n" +
"  <xsl:variable name=\"content\"\n" +
"                select=\"node()[not(self::d:title or self::d:subtitle\n" +
"                            or self::d:titleabbrev\n" +
"                            or self::d:info\n" +
"                            or self::d:bookinfo)]\"/>\n" +
"\n" +
"  <xsl:variable name=\"titlepage-master-reference\">\n" +
"    <xsl:call-template name=\"select.pagemaster\">\n" +
"      <xsl:with-param name=\"pageclass\" select=\"'titlepage'\"/>\n" +
"    </xsl:call-template>\n" +
"  </xsl:variable>\n" +
"\n" +
"  <xsl:call-template name=\"front.cover\"/>\n" +
"\n" +
"  <xsl:if test=\"$preamble\">\n" +
"    <xsl:call-template name=\"page.sequence\">\n" +
"      <xsl:with-param name=\"master-reference\"\n" +
"                      select=\"$titlepage-master-reference\"/>\n" +
"      <xsl:with-param name=\"content\">\n" +
"        <fo:block id=\"{$id}\">\n" +
"          <xsl:call-template name=\"book.titlepage\"/>\n" +
"        </fo:block>\n" +
"      </xsl:with-param>\n" +
"    </xsl:call-template>\n" +
"  </xsl:if>\n" +
"\n" +
"  <xsl:apply-templates select=\"d:dedication\" mode=\"dedication\"/>\n" +
"  <xsl:apply-templates select=\"d:acknowledgements\" mode=\"acknowledgements\"/>\n" +
"\n" +
"  <xsl:call-template name=\"make.book.tocs\"/>\n" +
"\n" +
"  <xsl:apply-templates select=\"$content\"/>\n" +
"\n" +
"  <xsl:call-template name=\"back.cover\"/>\n" +
"\n" +
"</xsl:template>\n";
        message+="<!-- Sequence of chapters are wrapped into a single page sequence. -->\n" +
"<xsl:template match=\"d:chapter[preceding-sibling::*[1][self::d:chapter]]\"/>\n" +
"\n" +
"<xsl:template match=\"d:chapter[not(preceding-sibling::*[1][self::d:chapter])]\">\n" +
"  <xsl:variable name=\"id\">\n" +
"    <xsl:call-template name=\"object.id\"/>\n" +
"  </xsl:variable>\n" +
"\n" +
"  <xsl:variable name=\"master-reference\">\n" +
"    <xsl:call-template name=\"select.pagemaster\"/>\n" +
"  </xsl:variable>\n" +
"\n" +
"  <fo:page-sequence hyphenate=\"{$hyphenate}\"\n" +
"                    master-reference=\"{$master-reference}\">\n" +
"    <xsl:attribute name=\"language\">\n" +
"      <xsl:call-template name=\"l10n.language\"/>\n" +
"    </xsl:attribute>\n" +
"    <xsl:attribute name=\"format\">\n" +
"      <xsl:call-template name=\"page.number.format\">\n" +
"        <xsl:with-param name=\"master-reference\" select=\"$master-reference\"/>\n" +
"      </xsl:call-template>\n" +
"    </xsl:attribute>\n" +
"    <xsl:attribute name=\"initial-page-number\">\n" +
"      <xsl:call-template name=\"initial.page.number\">\n" +
"        <xsl:with-param name=\"master-reference\" select=\"$master-reference\"/>\n" +
"      </xsl:call-template>\n" +
"    </xsl:attribute>\n" +
"\n" +
"    <xsl:attribute name=\"force-page-count\">\n" +
"      <xsl:call-template name=\"force.page.count\">\n" +
"        <xsl:with-param name=\"master-reference\" select=\"$master-reference\"/>\n" +
"      </xsl:call-template>\n" +
"    </xsl:attribute>\n" +
"\n" +
"    <xsl:attribute name=\"hyphenation-character\">\n" +
"      <xsl:call-template name=\"gentext\">\n" +
"        <xsl:with-param name=\"key\" select=\"'hyphenation-character'\"/>\n" +
"      </xsl:call-template>\n" +
"    </xsl:attribute>\n" +
"    <xsl:attribute name=\"hyphenation-push-character-count\">\n" +
"      <xsl:call-template name=\"gentext\">\n" +
"        <xsl:with-param name=\"key\" select=\"'hyphenation-push-character-count'\"/>\n" +
"      </xsl:call-template>\n" +
"    </xsl:attribute>\n" +
"    <xsl:attribute name=\"hyphenation-remain-character-count\">\n" +
"      <xsl:call-template name=\"gentext\">\n" +
"        <xsl:with-param name=\"key\" select=\"'hyphenation-remain-character-count'\"/>\n" +
"      </xsl:call-template>\n" +
"    </xsl:attribute>\n" +
"\n" +
"    <xsl:apply-templates select=\".\" mode=\"running.head.mode\">\n" +
"      <xsl:with-param name=\"master-reference\" select=\"$master-reference\"/>\n" +
"    </xsl:apply-templates>\n" +
"\n" +
"    <xsl:apply-templates select=\".\" mode=\"running.foot.mode\">\n" +
"      <xsl:with-param name=\"master-reference\" select=\"$master-reference\"/>\n" +
"    </xsl:apply-templates>\n" +
"\n" +
"    <fo:flow flow-name=\"xsl-region-body\">\n" +
"      <xsl:call-template name=\"set.flow.properties\">\n" +
"        <xsl:with-param name=\"element\" select=\"local-name(.)\"/>\n" +
"        <xsl:with-param name=\"master-reference\" select=\"$master-reference\"/>\n" +
"      </xsl:call-template>\n" +
"\n" +
"      <fo:block id=\"{$id}\"\n" +
"                xsl:use-attribute-sets=\"component.titlepage.properties\">\n" +
"	<fo:marker marker-class-name=\"chapter.head.marker\">\n" +
"	  <xsl:apply-templates select=\".\" mode=\"titleabbrev.markup\">\n" +
"	    <xsl:with-param name=\"allow-anchors\" select=\"0\"/>\n" +
"	  </xsl:apply-templates>\n" +
"	</fo:marker>\n" +
"\n" +
"        <xsl:call-template name=\"chapter.titlepage\"/>\n" +
"      </fo:block>\n" +
"\n" +
"      <xsl:variable name=\"toc.params\">\n" +
"        <xsl:call-template name=\"find.path.params\">\n" +
"          <xsl:with-param name=\"table\" select=\"normalize-space($generate.toc)\"/>\n" +
"        </xsl:call-template>\n" +
"      </xsl:variable>\n" +
"      <xsl:if test=\"contains($toc.params, 'toc')\">\n" +
"        <xsl:call-template name=\"component.toc\">\n" +
"          <xsl:with-param name=\"toc.title.p\" \n" +
"                          select=\"contains($toc.params, 'title')\"/>\n" +
"        </xsl:call-template>\n" +
"        <xsl:call-template name=\"component.toc.separator\"/>\n" +
"      </xsl:if>\n" +
"      <xsl:apply-templates/>\n" +
"      \n" +
"      <xsl:variable name=\"this-chapter-id\" select=\"generate-id()\"/>\n" +
"\n" +
"      <xsl:apply-templates\n" +
"	  select=\"following-sibling::d:chapter[preceding-sibling::*[1][self::d:chapter]\n" +
"		  and\n" +
"		  generate-id(preceding-sibling::d:chapter[not(preceding-sibling::*[1][self::d:chapter])][1])\n" +
"		  = $this-chapter-id]\"\n" +
"	  mode=\"no-page-seq\"/>\n" +
"    </fo:flow>\n" +
"  </fo:page-sequence>\n" +
"</xsl:template>\n" +
"\n" +
"<xsl:template match=\"d:chapter\" mode=\"no-page-seq\">\n" +
"  <xsl:variable name=\"id\">\n" +
"    <xsl:call-template name=\"object.id\"/>\n" +
"  </xsl:variable>\n" +
"\n" +
"  <fo:block id=\"{$id}\" break-before=\"page\"\n" +
"            xsl:use-attribute-sets=\"component.titlepage.properties\">\n" +
"    <fo:marker marker-class-name=\"chapter.head.marker\">\n" +
"      <xsl:apply-templates select=\".\" mode=\"titleabbrev.markup\">\n" +
"	<xsl:with-param name=\"allow-anchors\" select=\"0\"/>\n" +
"      </xsl:apply-templates>\n" +
"    </fo:marker>\n" +
"\n" +
"    <xsl:call-template name=\"chapter.titlepage\"/>\n" +
"  </fo:block>\n" +
"  \n" +
"  <xsl:variable name=\"toc.params\">\n" +
"    <xsl:call-template name=\"find.path.params\">\n" +
"      <xsl:with-param name=\"table\" select=\"normalize-space($generate.toc)\"/>\n" +
"    </xsl:call-template>\n" +
"  </xsl:variable>\n" +
"  <xsl:if test=\"contains($toc.params, 'toc')\">\n" +
"    <xsl:call-template name=\"component.toc\">\n" +
"      <xsl:with-param name=\"toc.title.p\" \n" +
"                      select=\"contains($toc.params, 'title')\"/>\n" +
"    </xsl:call-template>\n" +
"    <xsl:call-template name=\"component.toc.separator\"/>\n" +
"  </xsl:if>\n" +
"  <xsl:apply-templates/>\n" +
"</xsl:template>\n" +
"\n" +
"<!-- No page break between list of figures, tables, etc... -->\n" +
"<xsl:template name=\"make.book.tocs\">\n" +
"\n" +
"  <xsl:variable name=\"lot-master-reference\">\n" +
"    <xsl:call-template name=\"select.pagemaster\">\n" +
"      <xsl:with-param name=\"pageclass\" select=\"'lot'\"/>\n" +
"    </xsl:call-template>\n" +
"  </xsl:variable>\n" +
"\n" +
"  <xsl:variable name=\"toc.params\">\n" +
"    <xsl:call-template name=\"find.path.params\">\n" +
"      <xsl:with-param name=\"table\" select=\"normalize-space($generate.toc)\"/>\n" +
"    </xsl:call-template>\n" +
"  </xsl:variable>\n" +
"\n" +
"  <xsl:if test=\"contains($toc.params, 'toc')\">\n" +
"    <xsl:call-template name=\"page.sequence\">\n" +
"      <xsl:with-param name=\"master-reference\"\n" +
"                      select=\"$lot-master-reference\"/>\n" +
"      <xsl:with-param name=\"element\" select=\"'toc'\"/>\n" +
"      <xsl:with-param name=\"gentext-key\" select=\"'TableofContents'\"/>\n" +
"      <xsl:with-param name=\"content\">\n" +
"        <xsl:call-template name=\"division.toc\">\n" +
"          <xsl:with-param name=\"toc.title.p\" \n" +
"                          select=\"contains($toc.params, 'title')\"/>\n" +
"        </xsl:call-template>\n" +
"      </xsl:with-param>\n" +
"    </xsl:call-template>\n" +
"  </xsl:if>\n" +
"\n" +
"  <xsl:if test=\".//d:figure or .//d:table or .//d:example\">\n" +
"    <xsl:call-template name=\"page.sequence\">\n" +
"      <xsl:with-param name=\"master-reference\"\n" +
"                      select=\"$lot-master-reference\"/>\n" +
"      <xsl:with-param name=\"element\" select=\"'toc'\"/>\n" +
"      <xsl:with-param name=\"gentext-key\" select=\"'ListofFigures'\"/>\n" +
"      <xsl:with-param name=\"content\">\n" +
"	<xsl:if test=\"contains($toc.params,'figure') and .//d:figure\">\n" +
"          <xsl:call-template name=\"list.of.titles\">\n" +
"            <xsl:with-param name=\"titles\" select=\"'figure'\"/>\n" +
"            <xsl:with-param name=\"nodes\" select=\".//d:figure\"/>\n" +
"          </xsl:call-template>\n" +
"	</xsl:if>\n" +
"\n" +
"	<xsl:if test=\"contains($toc.params,'table') and .//d:table\">\n" +
"          <xsl:call-template name=\"list.of.titles\">\n" +
"            <xsl:with-param name=\"titles\" select=\"'table'\"/>\n" +
"            <xsl:with-param name=\"nodes\" select=\".//d:table[not(@tocentry = 0)]\"/>\n" +
"          </xsl:call-template>\n" +
"	</xsl:if>\n" +
"\n" +
"	<xsl:if test=\"contains($toc.params,'example') and .//d:example\">\n" +
"          <xsl:call-template name=\"list.of.titles\">\n" +
"            <xsl:with-param name=\"titles\" select=\"'example'\"/>\n" +
"            <xsl:with-param name=\"nodes\" select=\".//d:example\"/>\n" +
"          </xsl:call-template>\n" +
"	</xsl:if>\n" +
"\n" +
"	<xsl:if test=\"contains($toc.params,'equation') and \n" +
"                      .//d:equation[d:title or d:info/d:title]\">\n" +
"          <xsl:call-template name=\"list.of.titles\">\n" +
"            <xsl:with-param name=\"titles\" select=\"'equation'\"/>\n" +
"            <xsl:with-param name=\"nodes\" \n" +
"                            select=\".//d:equation[d:title or d:info/d:title]\"/>\n" +
"          </xsl:call-template>\n" +
"	</xsl:if>\n" +
"\n" +
"	<xsl:if test=\"contains($toc.params,'procedure') and \n" +
"                      .//d:procedure[d:title or d:info/d:title]\">\n" +
"          <xsl:call-template name=\"list.of.titles\">\n" +
"            <xsl:with-param name=\"titles\" select=\"'procedure'\"/>\n" +
"            <xsl:with-param name=\"nodes\" \n" +
"                            select=\".//d:procedure[d:title or d:info/d:title]\"/>\n" +
"          </xsl:call-template>\n" +
"	</xsl:if>\n" +
"      </xsl:with-param>\n" +
"    </xsl:call-template>\n" +
"  </xsl:if>\n" +
"</xsl:template>\n" +
"\n" +
"<xsl:template name=\"list.of.titles\">\n" +
"  <xsl:param name=\"titles\" select=\"'table'\"/>\n" +
"  <xsl:param name=\"nodes\" select=\".//d:table\"/>\n" +
"  <xsl:param name=\"toc-context\" select=\".\"/>\n" +
"\n" +
"  <xsl:variable name=\"id\">\n" +
"    <xsl:call-template name=\"object.id\"/>\n" +
"  </xsl:variable>\n" +
"\n" +
"  <xsl:if test=\"$nodes\">\n" +
"    <fo:block id=\"lot...{$titles}...{$id}\">\n" +
"      <xsl:choose>\n" +
"        <xsl:when test=\"$titles='table'\">\n" +
"          <xsl:call-template name=\"list.of.tables.titlepage\"/>\n" +
"        </xsl:when>\n" +
"        <xsl:when test=\"$titles='figure'\">\n" +
"          <xsl:call-template name=\"list.of.figures.titlepage\"/>\n" +
"        </xsl:when>\n" +
"        <xsl:when test=\"$titles='equation'\">\n" +
"          <xsl:call-template name=\"list.of.equations.titlepage\"/>\n" +
"        </xsl:when>\n" +
"        <xsl:when test=\"$titles='example'\">\n" +
"          <xsl:call-template name=\"list.of.examples.titlepage\"/>\n" +
"        </xsl:when>\n" +
"        <xsl:when test=\"$titles='procedure'\">\n" +
"          <xsl:call-template name=\"list.of.procedures.titlepage\"/>\n" +
"        </xsl:when>\n" +
"        <xsl:otherwise>\n" +
"          <xsl:call-template name=\"list.of.unknowns.titlepage\"/>\n" +
"        </xsl:otherwise>\n" +
"      </xsl:choose>\n" +
"\n" +
"      <fo:list-block xsl:use-attribute-sets=\"list.block.spacing orderedlist.properties\">\n" +
"        <xsl:attribute name=\"provisional-distance-between-starts\">1.6em</xsl:attribute>\n" +
"\n" +
"	<xsl:apply-templates select=\"$nodes\" mode=\"toc\">\n" +
"          <xsl:with-param name=\"toc-context\" select=\"$toc-context\"/>\n" +
"	</xsl:apply-templates>\n" +
"      </fo:list-block>\n" +
"    </fo:block>\n" +
"  </xsl:if>\n" +
"</xsl:template>\n" +
"\n" +
"<xsl:template match=\"d:figure|d:table|d:example|d:equation|d:procedure\" mode=\"toc\">\n" +
"  <xsl:variable name=\"id\">\n" +
"    <xsl:call-template name=\"object.id\"/>\n" +
"  </xsl:variable>\n" +
"  \n" +
"  <fo:list-item>\n" +
"    <fo:list-item-label end-indent=\"label-end()\" xsl:use-attribute-sets=\"orderedlist.label.properties\">\n" +
"      <fo:block>\n" +
"	<xsl:apply-templates select=\".\" mode=\"label.markup\"/>\n" +
"        <xsl:value-of select=\"$autotoc.label.separator\"/>\n" +
"      </fo:block>\n" +
"    </fo:list-item-label>\n" +
"    <fo:list-item-body start-indent=\"body-start()\">\n" +
"      <fo:block xsl:use-attribute-sets=\"toc.line.properties\">\n" +
"	<fo:inline keep-with-next.within-line=\"always\">\n" +
"	  <fo:basic-link internal-destination=\"{$id}\">\n" +
"            <xsl:apply-templates select=\".\" mode=\"titleabbrev.markup\"/>\n" +
"	  </fo:basic-link>\n" +
"	</fo:inline>\n" +
"	<fo:inline keep-together.within-line=\"always\">\n" +
"	  <xsl:text> </xsl:text>\n" +
"	  <fo:leader leader-pattern=\"dots\"\n" +
"                     leader-pattern-width=\"3pt\"\n" +
"                     leader-alignment=\"reference-area\"\n" +
"                     keep-with-next.within-line=\"always\"/>\n" +
"	  <xsl:text> </xsl:text> \n" +
"	  <fo:basic-link internal-destination=\"{$id}\">\n" +
"            <fo:page-number-citation ref-id=\"{$id}\"/>\n" +
"	  </fo:basic-link>\n" +
"	</fo:inline>\n" +
"      </fo:block>\n" +
"    </fo:list-item-body>\n" +
"  </fo:list-item>\n" +
"</xsl:template>\n" +
"\n" +
"<!-- ==== Remove duplicate IDs due to content library reuse ==== -->\n" +
"<xsl:template match=\"@xml:id\" mode=\"profile\">\n" +
"  <xsl:variable name=\"id\" select=\".\"/>\n" +
"\n" +
"  <xsl:if test=\"not(preceding::*[@xml:id=$id])\">\n" +
"    <xsl:copy-of select=\".\"/>\n" +
"  </xsl:if>\n" +
"</xsl:template>\n";
        message+="<!-- ==== Title Pages ====-->\n" +
"<xsl:template name=\"book.titlepage\">\n" +
"  <fo:block-container position=\"fixed\" top=\"0mm\" left=\"0mm\" width=\"{$page.width}\" height=\"{$page.height}\">\n" +
"    <fo:table table-layout=\"fixed\" height=\"{$page.height}\" width=\"100%\" text-align=\"left\" display-align=\"center\">\n"+
"      <fo:table-column column-width=\"proportional-column-width(50)\"/>\n" +//modifiable
"      <fo:table-column column-width=\"proportional-column-width(116)\"/>\n" +//modifiable
"      <fo:table-column column-width=\"proportional-column-width(43)\"/>\n" +//modifiable
"      \n" +
"      <fo:table-body start-indent=\"0pt\">	";
        
        
        
        return message;
    }
    
    //recupere le logo inserer dans le Menu
    public static String Logo(){
        String logo=null;
        
        
        return logo;
    }
    
    
    
    //recupere le message
    public static String getMessage(){
        String message ="";
        message=message();
        return message;
    }

    //le fichier .xml
    private static String l10n() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
