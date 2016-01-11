package controleur;


import Vue.Menu;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author anas
 */
public class controleur {
    
    
    private static Menu vue;
    
    public controleur(Menu vue) {
        this.vue = vue;
        this.vue.setControleur(this);
        // préparer l'état iniitial de la vue
        
    }
    
    //Affiche l'interface
    public void AfficherMenu(){
        getVue().setVisible(true);
    }
    
    //Quitter l'application
    public void quitter() {
        // Confirmer avant de quitter
        int rep = JOptionPane.showConfirmDialog(getVue(), "Quitter l'application\nEtes-vous sûr(e) ?", "XSLT-CM", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (rep == JOptionPane.YES_OPTION) {
            // mettre fin à l'application
//            getVue().dispose();
            System.exit(0);
        }
    }
    
    public static Menu getVue() {
        return vue;
    }

    public void setVue(Menu vue) {
        this.vue = vue;
    }
    
    public static String Entreprise(){
        String nom;
        nom=getVue().getjTextField1();
        return nom;
    }
    
    public static String Pdf(){
        String pdf;
        pdf="";
        pdf+="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
"<xsl:stylesheet xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\"\n" +
"		xmlns:fo=\"http://www.w3.org/1999/XSL/Format\"\n" +
"		xmlns:d=\"http://docbook.org/ns/docbook\"\n" +
"		exclude-result-prefixes=\"d\"\n" +
"		version=\"1.0\">\n" +
"\n" +
"<xsl:import href=\"pdf-"+Entreprise()+"-base.xsl\"/>\n" +
"\n" +
"<xsl:include href=\"page-layout-anywhere.xsl\"/>\n" +
"\n" +
"<xsl:template name=\"user.add.pagemasters\">\n" +
"  <!--\n" +
"      \"user.pagemasters\" is already used in page-layout-anywhere.xsl\n" +
"      \n" +
"      Use this one to add more pagemasters.\n" +
"  -->\n" +
"</xsl:template>\n" +
"\n" +
"</xsl:stylesheet>";
        return pdf;
    }
    
    public static String PdfBase(){
        String message;
        message="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
"<xsl:stylesheet xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\"\n" +
"		xmlns:fo=\"http://www.w3.org/1999/XSL/Format\"\n" +
"		xmlns:d=\"http://docbook.org/ns/docbook\"\n" +
"		exclude-result-prefixes=\"d\"\n" +
"		version=\"1.0\">\n";
        
//logo.png
        
        message+="<?calenco-dep logo-"+Entreprise()+".png?>\n";//modifiable code
        
//les icones
        
        message+="<?calenco-dep fleche.png?>\n" +
"\n" +
"<?calenco-dep note.png?>\n" +
"<?calenco-dep tip.png?>\n" +
"<?calenco-dep important.png?>\n" +
"<?calenco-dep warning.png?>\n" +
"<?calenco-dep caution.png?>\n";
        
//xxx.xml
        
       message+="<?calenco-dep l10n-"+Entreprise()+".xml?>\n"+
               "\n";//modifiable code
//
        message+="<xsl:import href=\"http://docbook.sourceforge.net/release/xsl-ns/current/fo/profile-docbook.xsl\" />\n" +
"<xsl:import href=\"fo-tricks.xsl\" />\n" +
"\n" +
"<xsl:param name=\"fop1.extensions\" select=\"1\"></xsl:param>\n" +
"\n" +
"<xsl:param name=\"local.l10n.xml\" select=\"document('l10n-"+Entreprise()+".xml')\"/>\n" +
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
"      <fo:table-body start-indent=\"0pt\">	\n"+
                
//permet d’insérer les informations productname et productnumber
                
"	<fo:table-row block-progression-dimension=\"10mm\">	  \n" +
"          <fo:table-cell background-color=\"#007ac2\" border-bottom=\"1pt solid #007ac2\" border-right=\"1pt solid #007ac2\">\n" +
"	    <fo:block/>\n" +
"	  </fo:table-cell>\n" +
"\n" +
"	  <fo:table-cell text-align=\"center\" number-columns-spanned=\"2\" number-rows-spanned=\"3\">\n" +
"	    <fo:block color=\"#007ac2\" font-size=\"20pt\" font-weight=\"bold\">\n" +
"	      <xsl:value-of select =\"/*/d:info/d:productname\"/>\n" +
"            </fo:block>\n" +
"            <fo:block font-size=\"14pt\">\n" +
"	      <xsl:value-of select =\"/*/d:info/d:productnumber\"/>\n" +
"            </fo:block>\n" +
"          </fo:table-cell>	  \n" +
"	</fo:table-row>	\n" +
"\n	"+
                
//l’information keyword [1]
                
"        <fo:table-row block-progression-dimension=\"15mm\">          \n" +
"          <fo:table-cell text-align=\"center\" border-bottom=\"1pt solid #007ac2\" border-right=\"1pt solid #007ac2\" width=\"50mm\">\n" +
"	    <fo:block font-size=\"13\" margin-top=\"1mm\">\n" +
"	      <xsl:value-of select =\"/*/d:info/d:keywordset/d:keyword[1]\"/>\n" +
"	    </fo:block>\n" +
"	  </fo:table-cell>\n" +
"	</fo:table-row>\n" +
"\n	"+
                
//l'information keyword [2]
                
"        <fo:table-row block-progression-dimension=\"15mm\">          \n" +
"          <fo:table-cell text-align=\"center\"  border-bottom=\"1pt solid #007ac2\" border-right=\"1pt solid #007ac2\" width=\"50mm\">\n" +
"	    <fo:block space-before=\"5pt\" font-size=\"11pt\" font-weight=\"bold\">\n" +
"	      <xsl:value-of select =\"/*/d:info/d:keywordset/d:keyword[2]\"/>\n" +
"	    </fo:block>\n" +
"	  </fo:table-cell>\n" +
"	</fo:table-row>"+
"\n"+
                
//permet d’insérer l’imageobjetet les informations title et releaseinfo
                
"        <fo:table-row block-progression-dimension=\"175mm\">          \n" +
"          <fo:table-cell  border-bottom=\"1pt solid #007ac2\" border-right=\"1pt solid #007ac2\">\n" +
"	    <fo:block/>\n" +
"	  </fo:table-cell>\n" +
"	  \n" +
"          <fo:table-cell text-align=\"center\" border-top=\"1pt solid #007ac2\" number-columns-spanned=\"2\">\n" +
"	    <fo:block font-size=\"0pt\" margin-left=\"5mm\"> \n" +
"	      <fo:external-graphic width=\"120mm\" content-height=\"140mm\" content-width=\"scale-to-fit\">\n" +
"		<xsl:variable name=\"filename\">\n" +
"		  <xsl:call-template name=\"mediaobject.filename\">\n" +
"		    <xsl:with-param name=\"object\" select=\"/*/d:info/d:mediaobject/d:imageobject\"/>\n" +
"		  </xsl:call-template>\n" +
"		</xsl:variable>\n" +
"		\n" +
"		<xsl:attribute name=\"src\">\n" +
"		  <xsl:call-template name=\"fo-external-image\">\n" +
"		    <xsl:with-param name=\"filename\">\n" +
"		      <xsl:if test=\"$img.src.path != '' and\n" +
"		                    not(starts-with($filename, '/')) and\n" +
"		                    not(contains($filename, '://'))\">\n" +
"			<xsl:value-of select=\"$img.src.path\"/>\n" +
"		      </xsl:if>\n" +
"		      <xsl:value-of select=\"$filename\"/>\n" +
"		    </xsl:with-param>\n" +
"		  </xsl:call-template>\n" +
"		</xsl:attribute>\n" +
"	      </fo:external-graphic>\n" +
"	    </fo:block>\n" +
"	    <fo:block space-before=\"19pt\" space-after=\"5pt\" font-size=\"16pt\"\n" +
"		      color=\"{$main.title.color}\">\n" +
"	      <xsl:value-of select =\"/*/d:info/d:title\"/> \n" +
"	    </fo:block>\n" +
"	    <fo:block space-after=\"5pt\" font-size=\"11pt\" font-weight=\"bold\">\n" +
"	      <xsl:value-of select =\"/*/d:info/d:releaseinfo\"/>\n" +
"	    </fo:block>\n" +
"	  </fo:table-cell> \n" +
"	</fo:table-row>\n" +
"\n	"+
                
//permet d’insérer les informations coveret annotation
                
"        <fo:table-row block-progression-dimension=\"75mm\">         \n" +
"          <fo:table-cell text-align=\"center\" border-top=\"13pt solid #007ac2\" border-right=\"1pt solid #007ac2\" number-columns-spanned=\"2\">\n" +
"	    <fo:block>\n" +
"	      <xsl:apply-templates select =\"d:info/d:cover\"/>\n" +
"	    </fo:block>\n" +
"	  </fo:table-cell>\n" +
"	  \n" +
"          <fo:table-cell padding-left=\"1em\" padding-right=\"4mm\" border-top=\"13pt solid #007ac2\" border-left=\"1pt solid #007ac2\">\n" +
"	    <fo:block>\n" +
"	      <xsl:apply-templates select=\"/*/d:info/d:annotation/*\"/>\n" +
"	    </fo:block>\n" +
"	  </fo:table-cell>\n" +
"	</fo:table-row>\n" +
"      </fo:table-body>\n" +
"    </fo:table>\n" +
"  </fo:block-container>\n" +
"\n" +
"</xsl:template>\n" +
"\n "+
                
//Formatage

//Cover
"<xsl:template match=\"d:cover\">\n" +
"  <fo:block text-align=\"center\">\n" +
"    <xsl:apply-templates/>\n" +
"  </fo:block>\n" +
"</xsl:template>\n" +
"\n" +

//Cover / mediaobject

"<xsl:template match=\"d:mediaobject[ancestor::d:cover]\">\n" +
"  <fo:block>\n" +
"    <xsl:apply-templates/> \n" +
"  </fo:block>\n" +
"</xsl:template>\n" +
"\n" +
                
//Cover / adresse
                
"<xsl:template match=\"d:cover/d:address\">\n" +
"  <xsl:param name=\"suppress-numbers\" select=\"'0'\"/>\n" +
"  \n" +
"  <xsl:variable name=\"content\">\n" +
"    <xsl:choose>\n" +
"      <xsl:when test=\"$suppress-numbers = '0'\n" +
"                      and @linenumbering = 'numbered'\n" +
"                      and $use.extensions != '0'\n" +
"                      and $linenumbering.extension != '0'\">\n" +
"        <xsl:call-template name=\"number.rtf.lines\">\n" +
"          <xsl:with-param name=\"rtf\">\n" +
"            <xsl:apply-templates/>\n" +
"          </xsl:with-param>\n" +
"        </xsl:call-template>\n" +
"      </xsl:when>\n" +
"      <xsl:otherwise>\n" +
"        <xsl:apply-templates/>\n" +
"      </xsl:otherwise>\n" +
"    </xsl:choose>\n" +
"  </xsl:variable>\n" +
"  \n" +
"  <fo:block xsl:use-attribute-sets=\"verbatim.properties\"\n" +
"	    text-align=\"center\">\n" +
"    <xsl:copy-of select=\"$content\"/>\n" +
"  </fo:block>\n" +
"</xsl:template>\n"+
"\n"+
"<xsl:template match=\"*[@role='italic']\">\n" +
"<fo:inline font-weight=\"bold\" font-style=\"italic\">\n" +
"<xsl:apply-templates/>\n" +
"</fo:inline>\n" +
"</xsl:template>\n" +
"<xsl:template name=\"chapter.titlepage\">\n" +
"  \n" +
"</xsl:template>\n"+
                
//Header Footer
                
"<!-- ==== Header, Footer ==== -->\n" +
"<xsl:param name=\"header.column.widths\">1 2 1</xsl:param>\n" +
"<xsl:param name=\"footer.column.widths\">1 1 1</xsl:param>\n" +
"\n" +
"<xsl:template name=\"header.content\">\n" +
"  <xsl:param name=\"pageclass\" select=\"''\"/>\n" +
"  <xsl:param name=\"sequence\" select=\"''\"/>\n" +
"  <xsl:param name=\"position\" select=\"''\"/>\n" +
"  <xsl:param name=\"gentext-key\" select=\"''\"/>\n" +
"  \n" +
"  <fo:block>\n" +
"    <xsl:if test=\"ancestor-or-self::d:chapter\">\n" +
"      <xsl:choose>\n" +
"	<xsl:when test=\"$sequence = 'odd' or $sequence = 'first'\">\n" +
"	  <fo:block-container position=\"fixed\" top=\"10mm\" left=\"{$page.width} - 15mm\"\n" +
"			      reference-orientation=\"90\" width=\"{$page.height} - 20mm\">\n" +
"	    <fo:block text-align=\"center\" text-transform=\"uppercase\" letter-spacing=\"0.4em\"\n" +
"		      color=\"{$chapter.title.color}\" font-weight=\"bold\" font-size=\"16pt\">\n" +
"	      <fo:retrieve-marker retrieve-class-name=\"chapter.head.marker\"\n" +
"				  retrieve-position=\"first-including-carryover\"\n" +
"				  retrieve-boundary=\"page-sequence\"/>	      \n" +
"	    </fo:block>\n" +
"	  </fo:block-container>\n" +
"	</xsl:when>\n" +
"	<xsl:when test=\"$sequence != 'blank'\">\n" +
"	  <fo:block-container position=\"fixed\" top=\"10mm\" left=\"10mm\"\n" +
"			      reference-orientation=\"90\" width=\"{$page.height} - 20mm\">\n" +
"	    <fo:block text-align=\"center\" text-transform=\"uppercase\" letter-spacing=\"0.4em\"\n" +
"		      color=\"{$chapter.title.color}\" font-weight=\"bold\" font-size=\"16pt\">\n" +
"	      <fo:retrieve-marker retrieve-class-name=\"chapter.head.marker\"\n" +
"				  retrieve-position=\"first-including-carryover\"\n" +
"				  retrieve-boundary=\"page-sequence\"/>	      \n" +
"	    </fo:block>\n" +
"	  </fo:block-container>	  \n" +
"	</xsl:when>\n" +
"      </xsl:choose>\n" +
"    </xsl:if>\n" +
"    <!-- sequence can be odd, even, first, blank -->\n" +
"    <!-- position can be left, center, right -->\n" +
"    <xsl:choose>\n" +
"      <xsl:when test=\"$sequence = 'blank'\">\n" +
"        <!-- nothing -->\n" +
"      </xsl:when>\n" +
"      \n" +
"      <xsl:when test=\"$pageclass = 'titlepage'\">\n" +
"	\n" +
"      </xsl:when>\n" +
"      \n" +
"      <xsl:when test=\"$position='left'\">\n" +
"        <fo:block font-size=\"11.5pt\">\n" +
"	  <xsl:value-of select =\"/*/d:info/d:productnumber\"/>\n" +
"        </fo:block>\n" +
"      </xsl:when>\n" +
"      \n" +
"      <xsl:when test=\"$position='center' and parent::d:book\">\n" +
"	<fo:block text-align=\"center\" color=\"{$chapter.title.color}\" font-weight=\"bold\" font-size=\"14pt\">        \n" +
"	  <xsl:choose>\n" +
"	    <xsl:when test=\"ancestor-or-self::d:chapter\">\n" +
"	      <fo:retrieve-marker retrieve-class-name=\"chapter.head.marker\"\n" +
"				  retrieve-position=\"first-including-carryover\"\n" +
"				  retrieve-boundary=\"page-sequence\"/>\n" +
"	    </xsl:when>\n" +
"	    <xsl:otherwise>\n" +
"	      <xsl:apply-templates select=\".\"\n" +
"				   mode=\"titleabbrev.markup\"/>\n" +
"	    </xsl:otherwise>\n" +
"	  </xsl:choose>\n" +
"	</fo:block>\n" +
"      </xsl:when>\n" +
"      \n" +
"      <xsl:when test=\"$position='right'\">\n" +
"	<fo:external-graphic src=\"url({$logo})\" width=\"37mm\" content-height=\"15mm\" content-width=\"scale-to-fit\"/>\n" +
"      </xsl:when>\n" +
"    </xsl:choose>\n" +
"  </fo:block>\n" +
"</xsl:template>\n" +
"\n" +
"<xsl:template name=\"header.table\">\n" +
"  <xsl:param name=\"pageclass\" select=\"''\"/>\n" +
"  <xsl:param name=\"sequence\" select=\"''\"/>\n" +
"  <xsl:param name=\"gentext-key\" select=\"''\"/>\n" +
"\n  ";
                              //PARTIE DE KILIAN
//Entête table 
message+="<xsl:template name=\"header.table\">\n" +
"  <xsl:param name=\"pageclass\" select=\"''\"/>\n" +
"  <xsl:param name=\"sequence\" select=\"''\"/>\n" +
"  <xsl:param name=\"gentext-key\" select=\"''\"/>\n" +
"\n" +  
"  <!-- default is a single table style for all headers -->\n" +
"  <!-- Customize it for different page classes or sequence location -->\n" +
"  <!-- Test si c'est un index -->\n" +
"  <xsl:choose>\n" +
"    <xsl:when test=\"$pageclass = 'index'\">\n" +
"      <xsl:attribute name=\"margin-{$direction.align.start}\">0pt</xsl:attribute>\n" +
"    </xsl:when>\n" +
"  </xsl:choose>\n" +
"\n" +    
"  <!-- Définition variable -->\n" +
"  <xsl:variable name=\"column1\">\n" +
"    <xsl:choose>\n" +
"      <xsl:when test=\"$double.sided = 0\">1</xsl:when>\n" +
"      <xsl:when test=\"$sequence = 'first' or $sequence = 'odd'\">1</xsl:when>\n" +
"      <xsl:otherwise>3</xsl:otherwise>\n" +
"    </xsl:choose>\n" +
"  </xsl:variable>\n" +
  
"  <xsl:variable name=\"column3\">\n" +
"    <xsl:choose>\n" +
"      <xsl:when test=\"$double.sided = 0\">3</xsl:when>\n" +
"      <xsl:when test=\"$sequence = 'first' or $sequence = 'odd'\">3</xsl:when>\n" +
"      <xsl:otherwise>1</xsl:otherwise>\n" +
"    </xsl:choose>\n" +
"  </xsl:variable>\n" +

"  <xsl:variable name=\"candidate\">\n" +
"    <fo:table xsl:use-attribute-sets=\"header.table.properties\">\n" +
"      <xsl:call-template name=\"head.sep.rule\">\n" +
"        <xsl:with-param name=\"pageclass\" select=\"$pageclass\"/>\n" +
"        <xsl:with-param name=\"sequence\" select=\"$sequence\"/>\n" +
"        <xsl:with-param name=\"gentext-key\" select=\"$gentext-key\"/>\n" +
"      </xsl:call-template>\n" +
"\n" +      
"      <fo:table-column column-number=\"1\">\n" +
"        <xsl:attribute name=\"column-width\">\n" +
"          <xsl:text>proportional-column-width(</xsl:text>\n" +
"          <xsl:call-template name=\"header.footer.width\">\n" +
"            <xsl:with-param name=\"location\">header</xsl:with-param>\n" +
"            <xsl:with-param name=\"position\" select=\"$column1\"/>\n" +
"          </xsl:call-template>\n" +
"          <xsl:text>)</xsl:text>\n" +
"        </xsl:attribute>\n" +
"      </fo:table-column>\n" +
"      <fo:table-column column-number=\"2\">\n" +
"        <xsl:attribute name=\"column-width\">\n" +
"          <xsl:text>proportional-column-width(</xsl:text>\n" +
"          <xsl:call-template name=\"header.footer.width\">\n" +
"            <xsl:with-param name=\"location\">header</xsl:with-param>\n" +
"            <xsl:with-param name=\"position\" select=\"2\"/>\n" +
"          </xsl:call-template>\n" +
"          <xsl:text>)</xsl:text>\n" +
"        </xsl:attribute>\n" +
"      </fo:table-column>\n" +
"      <fo:table-column column-number=\"3\">\n" +
"        <xsl:attribute name=\"column-width\">\n" +
"          <xsl:text>proportional-column-width(</xsl:text>\n" +
"          <xsl:call-template name=\"header.footer.width\">\n" +
"            <xsl:with-param name=\"location\">header</xsl:with-param>\n" +
"            <xsl:with-param name=\"position\" select=\"$column3\"/>\n" +
"          </xsl:call-template>\n" +
"          <xsl:text>)</xsl:text>\n" +
"        </xsl:attribute>\n" +
"      </fo:table-column>\n" +
      
"      <fo:table-body>\n" +
"        <fo:table-row>\n" +
"          <xsl:attribute name=\"block-progression-dimension.minimum\">\n" +
"            <xsl:value-of select=\"$header.table.height\"/>\n" +
"          </xsl:attribute>\n" +
        //MODIFIABLE
"          <fo:table-cell text-align=\"start\"\n" +
"                         display-align=\"center\">\n" +
"            <xsl:if test=\"$fop.extensions = 0\">\n" +
"              <xsl:attribute name=\"relative-align\">baseline</xsl:attribute>\n" +
"            </xsl:if>\n" +
"            <fo:block>\n" +
"              <xsl:call-template name=\"header.content\">\n" +
"                <xsl:with-param name=\"pageclass\" select=\"$pageclass\"/>\n" +
"                <xsl:with-param name=\"sequence\" select=\"$sequence\"/>\n" +
"                <xsl:with-param name=\"position\" select=\"$direction.align.start\"/>\n" +
"                <xsl:with-param name=\"gentext-key\" select=\"$gentext-key\"/>\n" +
"              </xsl:call-template>\n" +
"            </fo:block>\n" +
"          </fo:table-cell>\n" +
        //MODIFIABLE
//"          <fo:table-cell text-align=\"center\"\n" +
//"                         display-align=\"center\">\n" +
"            <xsl:if test=\"$fop.extensions = 0\">\n" +
"              <xsl:attribute name=\"relative-align\">baseline</xsl:attribute>\n" +
"            </xsl:if>\n" +
"            <fo:block>\n" +
"              <xsl:call-template name=\"header.content\">\n" +
"                <xsl:with-param name=\"pageclass\" select=\"$pageclass\"/>\n" +
"                <xsl:with-param name=\"sequence\" select=\"$sequence\"/>\n" +
"                <xsl:with-param name=\"position\" select=\"'center'\"/>\n" +
"                <xsl:with-param name=\"gentext-key\" select=\"$gentext-key\"/>\n" +
"              </xsl:call-template>\n" +
"            </fo:block>\n" +
"          </fo:table-cell>\n" +
        //MODIFIABLE
//"          <fo:table-cell text-align=\"right\"\n" +
//"                         display-align=\"center\">\n" +
"            <xsl:if test=\"$fop.extensions = 0\">\n" +
"              <xsl:attribute name=\"relative-align\">baseline</xsl:attribute>\n" +
"            </xsl:if>\n" +
"            <fo:block>\n" +
"              <xsl:call-template name=\"header.content\">\n" +
"                <xsl:with-param name=\"pageclass\" select=\"$pageclass\"/>\n" +
"                <xsl:with-param name=\"sequence\" select=\"$sequence\"/>\n" +
"                <xsl:with-param name=\"position\" select=\"$direction.align.end\"/>\n" +
"                <xsl:with-param name=\"gentext-key\" select=\"$gentext-key\"/>\n" +
"              </xsl:call-template>\n" +
"            </fo:block>\n" +
"          </fo:table-cell>\n" +
"        </fo:table-row>\n" +
"      </fo:table-body>\n" +
"    </fo:table>\n" +
"  </xsl:variable>\n" +
"\n" +  
"  <!-- Really output a header? -->\n" +
"  <!-- Mise en page -->\n" +
"  <xsl:choose>\n" +
"    <xsl:when test=\"$pageclass = 'titlepage' and $gentext-key = 'book'\"\n" +
"                    and $sequence='first'\">\"\n" +
"      <!-- no, book titlepages have no headers at all -->\n" +
"    </xsl:when>\n" +
"    <xsl:when test=\"$sequence = 'blank' and $headers.on.blank.pages = 0\">\n" +
"      <!-- no output -->\n" +
"    </xsl:when>\n" +
"    <xsl:otherwise>\n" +
"      <xsl:copy-of select=\"$candidate\"/>\n" +
"    </xsl:otherwise>\n" +
"  </xsl:choose>\n" +
"</xsl:template>\n" +
"\n" ;
message+="<!-- Paramètres pied de page -->\n" +
"<xsl:template name=\"footer.content\">\n" +
"  <xsl:param name=\"pageclass\" select=\"''\"/>\n" +
"  <xsl:param name=\"sequence\" select=\"''\"/>\n" +
"  <xsl:param name=\"position\" select=\"''\"/>\n" +
"  <xsl:param name=\"gentext-key\" select=\"''\"/>\n" +
"\n" +  
"  <fo:block>\n" +
"    <!-- pageclass can be front, body, back -->\n" +
"    <!-- sequence can be odd, even, first, blank -->\n" +
"    <!-- position can be left, center, right -->\n" +
"    <xsl:choose>\n" +
"      <xsl:when test=\"$pageclass = 'titlepage'\">\n" +
"        <!-- nop; no footer on title pages -->\n" +
"      </xsl:when>\n" +
"\n" +
"      <xsl:when test=\"$double.sided = 0 and $position='right'\">\n" +
"        <fo:page-number/>\n" +
"      </xsl:when>\n" +
"\n" +      
"      <xsl:when test=\"$double.sided != 0 and $sequence = 'even'\"\n" +
"                      and $position='left'\">\n" +
"        <fo:page-number/>\n" +
"      </xsl:when>\n" +
"\n" +      
"      <xsl:when test=\"$double.sided != 0 and ($sequence = 'odd' or $sequence = 'first')\"\n" +
"                      and $position='right'>\n" +
"        <fo:page-number/>\n" +
"      </xsl:when>\n" +
"\n" +     
"      <xsl:when test=\"$sequence='blank'\">\n" +
"        <xsl:choose>\n" +
"          <xsl:when test=\"$double.sided != 0 and $position = 'left'\">\n" +
"            <fo:page-number/>\n" +
"          </xsl:when>\n" +
"          <xsl:otherwise>\n" +
"            <!-- nop -->\n" +
"          </xsl:otherwise>\n" +
"        </xsl:choose>\n" +
"      </xsl:when>\n" +
"      <xsl:otherwise>\n" +
"        <!-- nop -->\n" +
"      </xsl:otherwise>\n" +
"    </xsl:choose>\n" +
"  </fo:block>\n" +
"</xsl:template>\n" +

"<!-- List item -->\n" +
"<xsl:attribute-set name=\"list.block.spacing\">\n" +
"  <xsl:attribute name=\"margin-left\">\n" +
"    <xsl:choose>\n" +
        //MODIFIABLE
//"      <xsl:when test=\"self::itemizedlist\">0pt</xsl:when>\n" +
"      <xsl:otherwise>0pt</xsl:otherwise>\n" +
"    </xsl:choose>\n" +
"  </xsl:attribute>\n" +
"</xsl:attribute-set>\n" +
"\n" +
"<!-- Définition variables -->\n" +
"<xsl:template match=\"d:itemizedlist/d:listitem\">\n" +
"  <xsl:variable name=\"id\"><xsl:call-template name=\"object.id\"/></xsl:variable>\n" +
"\n" +
"  <xsl:variable name=\"keep.together\">\n" +
"    <xsl:call-template name=\"pi.dbfo_keep-together\"/>\n" +
"  </xsl:variable>\n" +
"\n" +
"  <xsl:variable name=\"item.contents\">\n" +
"    <fo:list-item-label end-indent=\"label-end()\" xsl:use-attribute-sets=\"itemizedlist.label.properties\">\n" +
"      <fo:block>\n" +
"        <xsl:call-template name=\"itemizedlist.label.markup\">\n" +
"          <xsl:with-param name=\"itemsymbol\">\n" +
"            <xsl:call-template name=\"list.itemsymbol\">\n" +
"              <xsl:with-param name=\"node\" select=\"parent::d:itemizedlist\"/>\n" +
"            </xsl:call-template>\n" +
"          </xsl:with-param>\n" +
"        </xsl:call-template>\n" +
"      </fo:block>\n" +
"    </fo:list-item-label>\n" +
"    <fo:list-item-body start-indent=\"body-start()\">\n" +
"      <xsl:choose>\n" +
"        <!-- * work around broken passivetex list-item-body rendering -->\n" +
"        <xsl:when test=\"$passivetex.extensions = '1'\">\n" +
"          <xsl:apply-templates/>\n" +
"        </xsl:when>\n" +
"        <xsl:otherwise>\n" +
"          <fo:block>\n" +
"            <xsl:apply-templates/>\n" +
"          </fo:block>\n" +
"        </xsl:otherwise>\n" +
"      </xsl:choose>\n" +
"    </fo:list-item-body>\n" +
"  </xsl:variable>\n" +
"\n" +
"  <!-- Mise en page -->\n" +
"  <xsl:choose>\n" +
"    <xsl:when test=\"parent::*/@spacing = 'compact'\">\n" +
"      <fo:list-item id=\"{$id}\" xsl:use-attribute-sets=\"compact.list.item.spacing\">\n" +
"        <xsl:if test=\"$keep.together != ''\">\n" +
"          <xsl:attribute name=\"keep-together.within-column\"><xsl:value-of\n" +
"                          select=\"$keep.together\"/></xsl:attribute>\n" +
"        </xsl:if>\n" +
"        <xsl:copy-of select=\"$item.contents\"/>\n" +
"      </fo:list-item>\n" +
"    </xsl:when>\n" +
"    <xsl:otherwise>\n" +
"     <fo:list-item id=\"{$id}\" xsl:use-attribute-sets=\"list.item.spacing\">\n" +
"        <xsl:if test=\"$keep.together != ''\">\n" +
"          <xsl:attribute name=\"keep-together.within-column\"><xsl:value-of\n" +
"                          select=\"$keep.together\"/></xsl:attribute>\n" +
"        </xsl:if>\n" +
"        <xsl:copy-of select=\"$item.contents\"/>\n" +
"      </fo:list-item>\n" +
"    </xsl:otherwise>\n" +
"  </xsl:choose>\n" +
"</xsl:template>\n" +
"\n" +
"<!-- ==== Header, Footer ==== -->\n" +
"<xsl:param name=\"header.rule\" select=\"0\"/>\n" +
"<xsl:param name=\"footer.rule\" select=\"0\"/>\n" +
"\n" +
"<!-- Paramètres sommaire -->\n" +
"<!-- ==== TOC ==== -->\n" +
"<xsl:param name=\"generate.toc\">\n" +
"  /appendix toc,title\n" +
"  article/appendix  nop\n" +
"  /article  toc,title\n" +
"  book      toc,title,figure,table,example,equation\n" +
"  /chapter  toc,title\n" +
"  part      toc,title\n" +
"  /preface  toc,title\n" +
"  reference toc,title\n" +
"  /sect1    toc\n" +
"  /sect2    toc\n" +
"  /sect3    toc\n" +
"  /sect4    toc\n" +
"  /sect5    toc\n" +
"  /section  toc\n" +
"  set       toc,title\n" +
"</xsl:param>\n" +

"<!-- Initialisation numéro de pages -->\n" +
"<xsl:template name=\"initial.page.number\">auto</xsl:template>\n" +
"<xsl:template name=\"page.number.format\">1</xsl:template>\n" +
"\n" +
        //MODIFIABLE
"<!-- Page de titre du sommaire -->\n" +
"<xsl:template name=\"table.of.contents.titlepage.recto\">\n" +
"  <fo:block xsl:use-attribute-sets=\"table.of.contents.titlepage.recto.style\" \n" +
//"	    space-before.minimum=\"1em\" space-before.optimum=\"1.5em\" \n" +
//"	    space-before.maximum=\"2em\" margin-left=\"{$title.margin.left}\"\n" +
//"	    start-indent=\"0pt\" font-weight=\"normal\" font-family=\"{$title.fontset}\"\n" +
//"	    space-after=\"15pt\" color=\"gray\" font-size=\"24pt\">\n" +
"    <xsl:call-template name=\"gentext\">\n" +
"      <xsl:with-param name=\"key\" select=\"'TableofContents'\"/>\n" +
"    </xsl:call-template>\n" +
"  </fo:block>\n" +
"</xsl:template>\n" +
"\n" +
"<!-- Formatage du contenu -->\n" +
"<xsl:attribute-set name=\"toc.line.properties\">\n" +
"  <xsl:attribute name=\"color\">\n" +
"    <xsl:choose>\n" +
        //MODIFIABLE
//"      <xsl:when test=\"self::d:section[not(ancestor::d:section)]\">gray</xsl:when>\n" +
//"      <xsl:otherwise>inherit</xsl:otherwise>\n" +
"    </xsl:choose>\n" +
"  </xsl:attribute> \n" +
"  <xsl:attribute name=\"font-weight\">\n" +
"    <xsl:choose>\n" +
        //MODIFIABLE
//"      <xsl:when test=\"self::d:section[not(ancestor::d:section)]\">bold</xsl:when>\n" +
//"      <xsl:otherwise>normal</xsl:otherwise>\n" +
"    </xsl:choose>\n" +
"  </xsl:attribute> \n" +
"  <xsl:attribute name=\"font-size\">\n" +
"    <xsl:choose>\n" +
        //MODIFIABLE
//"      <xsl:when test=\"self::d:section[not(ancestor::d:section)]\">11pt</xsl:when>\n" +
//"      <xsl:otherwise>9pt</xsl:otherwise>\n" +
"    </xsl:choose>\n" +
"  </xsl:attribute> \n" +   
"  <xsl:attribute name=\"keep-with-previous.within-column\">\n" +
"    <xsl:choose>\n" +
"      <xsl:when test=\"ancestor::d:section\">always</xsl:when>\n" +
"      <xsl:otherwise>auto</xsl:otherwise>\n" +
"    </xsl:choose>\n" +
"  </xsl:attribute>\n" +
"</xsl:attribute-set>\n" +
"\n" +
"<!-- Mise en page -->\n" +
"<xsl:template name=\"toc.line\">\n" +
"  <xsl:param name=\"toc-context\" select=\"NOTANODE\"/>\n" +
"\n" +  
"  <xsl:variable name=\"id\">\n" +
"    <xsl:call-template name=\"object.id\"/>\n" +
"  </xsl:variable>\n" +
"\n" +  
"  <xsl:variable name=\"label\">\n" +
"    <xsl:apply-templates select=\".\" mode=\"label.markup\"/>\n" +
"  </xsl:variable>\n" +
" \n" + 
"  <xsl:choose>\n" +
"    <xsl:when test=\"self::d:chapter\">\n" +
        //MODIFIABLE
//"      <fo:block border-bottom=\"solid, #007ac2, 2pt\" space-after=\"10pt\" space-before=\"10pt\"\n" + 
//"                font-weight=\"bold\" font-size=\"12pt\" text-transform=\"uppercase\" width=\"120mm\">\n" +
"	<fo:basic-link internal-destination=\"{$id}\">\n" +
"          <xsl:apply-templates select=\".\" mode=\"titleabbrev.markup\"/>\n" +
"	</fo:basic-link>\n" +
"      </fo:block> \n" +  
"    </xsl:when>\n" +
"\n" +    
"    <xsl:otherwise>\n" +
"      <fo:block xsl:use-attribute-sets=\"toc.line.properties\">\n" +
"	<fo:inline keep-with-next.within-line=\"always\">\n" +
"	  <fo:basic-link internal-destination=\"{$id}\">\n" +
"            <xsl:if test=\"$label != ''\">\n" +
"              <xsl:copy-of select=\"$label\"/>\n" +
"              <xsl:value-of select=\"$autotoc.label.separator\"/>\n" +
"            </xsl:if>\n" +
"            <xsl:apply-templates select=\".\" mode=\"titleabbrev.markup\"/>\n" +
"	  </fo:basic-link>\n" +
"	</fo:inline>\n" +
"	<fo:inline keep-together.within-line=\"always\">\n" +
"	  <xsl:text> </xsl:text>\n" +
        //MODIFIABLE
//"	  <fo:leader leader-pattern=\"dots\"\n" +
//"                     leader-pattern-width=\"3pt\"\n" +
//"                     leader-alignment=\"reference<-area\"\n" +
//"                     keep-with-next.within-line=\"always\"/\n" +
"	  <xsl:text> </xsl:text> \n" +
"	  <fo:basic-link internal-destination=\"{$id}\">\n" +
"            <fo:page-number-citation ref-id=\"{$id}\"/>\n" +
"	  </fo:basic-link>\n" +
"	</fo:inline>\n" +
"      </fo:block>\n" +
"    </xsl:otherwise>\n" +
"  </xsl:choose>\n" +
"</xsl:template>\n" +
"\n" +
"<!-- Intégration du formatage dans la mise en page -->\n" +
"<xsl:template name=\"set.toc.indent\">\n" +
"  <xsl:param name=\"reldepth\"/>\n" +
"\n" +
"  <xsl:variable name=\"depth\">\n" +
"    <xsl:choose>\n" +
"      <xsl:when test=\"$reldepth != ''\">\n" +
"        <xsl:value-of select=\"$reldepth\"/>\n" +
"      </xsl:when>\n" +
"      <xsl:otherwise>\n" +
"        <xsl:value-of select=\"count(ancestor::*)\"/>\n" +
"      </xsl:otherwise>\n" +
"    </xsl:choose>\n" +
"  </xsl:variable>\n" +
"\n" +
"  <xsl:choose>\n" +
"    <xsl:when test=\"$fop.extensions != 0 or $passivetex.extensions != 0\">\n" +
"       <xsl:value-of select=\"concat($depth*$toc.indent.width, 'pt')\"/>\n" +
"    </xsl:when>\n" +
"    <xsl:when test=\"parent::d:book\"/>\n" +
"    <xsl:otherwise>\n" +
"      <xsl:value-of select=\"concat($toc.indent.width, 'pt')\"/>\n" +
"    </xsl:otherwise>\n" +
"  </xsl:choose>\n" +
"</xsl:template>\n" +
"\n" +
"<!-- Page des listes -->\n" +
"<xsl:template name=\"list.of.figures.titlepage.recto\">\n" +
"  <fo:block xmlns:fo=\"http://www.w3.org/1999/XSL/Format\"\n" +
        //MODIFIABLE
//"	    xsl:use-attribute-sets=\"list.of.figures.titlepage.recto.style\" \n" +
//"	    space-before.minimum=\"1em\" space-before.optimum=\"1.5em\" \n" +
//"	    space-before.maximum=\"2em\" space-after=\"0.5em\" \n" +
//"	    margin-left=\"{$title.margin.left}\" start-indent=\"0pt\" font-size=\"17.28pt\" \n" +
//"	    font-weight=\"bold\" font-family=\"{$title.fontset}\">\n" +
"    <xsl:call-template name=\"gentext\">\n" +
"      <xsl:with-param name=\"key\" select=\"'ListofFigures'\"/>\n" +
"    </xsl:call-template>\n" +
"  </fo:block>\n" +
"</xsl:template>\n" +
 
"<xsl:template name=\"back.cover\"> \n" +
"  <xsl:call-template name=\"page.sequence\">\n" +
"    <xsl:with-param name=\"master-reference\">blank</xsl:with-param>\n" +
"    <xsl:with-param name=\"content\">\n" +
"      <fo:block break-after=\"page\"/>\n" +
        //MODIFIABLE
//"      <fo:block-container position=\"fixed\" reference-orientation=\"90\" left=\"200mm\" top=\"20mm\"\n" +
//"			  width=\"180mm\">\n" +
"	<fo:block>Conception documentation technique <fo:inline font-weight=\"bold\">cabinet Martinez</fo:inline> Nantes - www.capmundi.com</fo:block>\n" +
"      </fo:block-container>\n" +
"\n" +    
        //MODIFIABLE
//"      <fo:block-container height=\"83mm\" width=\"210mm\" top=\"214mm\" text-align=\"center\" position=\"fixed\"\n" +
//"			  background-color=\"#ffffff\" space-before=\"10mm\">\n" +
//"\n" +	
//"  	<fo:block font-size=\"9pt\" border-top=\"13pt #007ac2 solid\" padding-top=\"7mm\"> \n" +
"	  <xsl:apply-templates select =\"d:info/d:cover\"/>\n" +
"	</fo:block>\n" +
"      </fo:block-container>\n" +
"    </xsl:with-param>\n" +
"  </xsl:call-template>\n" +
"</xsl:template>\n" +
"\n" +
"<xsl:template match=\"d:link[ancestor::d:cover]\">\n" +
        //MODIFIABLE
//"  <fo:inline color=\"#007ac2\" font-weight=\"bold\">\n" +
"    <xsl:apply-imports/>\n" +
"  </fo:inline>\n" +
"</xsl:template>\n" +
"\n" +
"<!-- \n" +
"     One can go on with list.of.tables, examples, etc...\n" +
"     These templates are in fo/titlepage.templates.xsl file\n" +
"     of the standard DocBook XSL\n" +
"-->\n" +
"\n" ;
message+="<!-- ==== Chapter, Appendix Titles ==== -->\n" +
"<!--\n" +
"    See: http://www.sagehill.net/docbookxsl/TitleFontSizes.html#ChapterTitles\n" +
"-->\n" +
"\n" +
"<!-- Numérotation des titres de chapitres et annexes -->\n" +
"<xsl:param name=\"appendix.autolabel\">A</xsl:param>\n" +
"<xsl:param name=\"chapter.autolabel\" select=\"0\"></xsl:param>\n" +
"\n" +
"<xsl:attribute-set name=\"component.title.properties\">\n" +
"  <!-- Has priority on following templates -->\n" +
"</xsl:attribute-set>\n" +
"\n" +
"<!-- ==== Section Titles ==== -->\n" +
"<xsl:param name=\"section.autolabel\" select=\"0\"></xsl:param>\n" +
"\n" +
"<!-- General Properties -->\n" +
"<xsl:attribute-set name=\"section.title.properties\">\n" +
"\n" +  
"</xsl:attribute-set>\n" +
"\n" +
"<!-- Variable et mise en page des titres de section -->\n" +
"<xsl:template name=\"section.heading\">\n" +
"  <xsl:param name=\"level\" select=\"1\"/>\n" +
"  <xsl:param name=\"marker\" select=\"1\"/>\n" +
"  <xsl:param name=\"title\"/>\n" +
"  <xsl:param name=\"marker.title\"/>\n" +
"\n" +  
"  <fo:block xsl:use-attribute-sets=\"section.title.properties\">\n" +
"    <xsl:if test=\"$marker != 0\">\n" +
"      <fo:marker marker-class-name=\"section.head.marker\">\n" +
"        <xsl:copy-of select=\"$marker.title\"/>\n" +
"      </fo:marker>\n" +
"    </xsl:if>\n" +
"\n" +
"    <xsl:choose>\n" +
"      <xsl:when test=\"$level=1\">\n" +
"        <fo:block xsl:use-attribute-sets=\"section.title.level1.properties\">\n" +
"          <xsl:copy-of select=\"$title\"/>\n" +
"        </fo:block>\n" +
"      </xsl:when>\n" +
"      <xsl:when test=\"$level=2\">\n" +
"        <fo:block display-align=\"center\" xsl:use-attribute-sets=\"section.title.level2.properties\">\n" +
"          <fo:external-graphic src=\"url(fleche.png)\" width=\"9mm\" content-height=\"4mm\" content-width=\"7mm\"/>\n" +
"          <xsl:copy-of select=\"$title\"/>\n" +
"        </fo:block>\n" +
"      </xsl:when>\n" +
"      <xsl:when test=\"$level=3\">\n" +
"        <fo:block xsl:use-attribute-sets=\"section.title.level3.properties\">\n" +
"          <xsl:copy-of select=\"$title\"/>\n" +
"        </fo:block>\n" +
"      </xsl:when>\n" +
"      <xsl:when test=\"$level=4\">\n" +
"        <fo:block xsl:use-attribute-sets=\"section.title.level4.properties\">\n" +
"          <xsl:copy-of select=\"$title\"/>\n" +
"        </fo:block>\n" +
"      </xsl:when>\n" +
"      <xsl:when test=\"$level=5\">\n" +
"        <fo:block xsl:use-attribute-sets=\"section.title.level5.properties\">\n" +
"          <xsl:copy-of select=\"$title\"/>\n" +
"        </fo:block>\n" +
"      </xsl:when>\n" +
"      <xsl:otherwise>\n" +
"        <fo:block xsl:use-attribute-sets=\"section.title.level6.properties\">\n" +
"          <xsl:copy-of select=\"$title\"/>\n" +
"        </fo:block>\n" +
"      </xsl:otherwise>\n" +
"    </xsl:choose>\n" +
"  </fo:block>\n" +
"</xsl:template>\n" +
"\n" ;
message+="<!-- Specific Level Properties -->\n" +
"<xsl:attribute-set name=\"section.title.level1.properties\">\n" +
"  <xsl:attribute name=\"font-size\">\n" +
"    <xsl:value-of select=\"$body.font.master * 1.8\"/>\n" +
"    <xsl:text>pt</xsl:text>\n" +
"  </xsl:attribute>\n" +
//"  <xsl:attribute name=\"border-bottom\">solid, #007ac2, 2pt </xsl:attribute>\n" +
"  <xsl:attribute name=\"color\">\n" +
"    <xsl:value-of select=\"$section.title.l1.color\"/>\n" +
"  </xsl:attribute>\n" +
"</xsl:attribute-set>\n" +
"\n" +
"<xsl:attribute-set name=\"section.title.level2.properties\">\n" +
"  <xsl:attribute name=\"font-size\">\n" +
"    <xsl:value-of select=\"$body.font.master * 1.8\"/>\n" +
"    <xsl:text>pt</xsl:text>\n" +
"  </xsl:attribute>\n" +
"  <xsl:attribute name=\"font-weight\">normal</xsl:attribute>\n" +
"  <xsl:attribute name=\"color\">\n" +
"    <xsl:value-of select=\"$section.title.l2.color\"/>\n" +
"  </xsl:attribute>\n" +
"</xsl:attribute-set>\n" +
"\n" +
"<xsl:attribute-set name=\"section.title.level3.properties\">\n" +
"  <xsl:attribute name=\"font-size\">\n" +
"    <xsl:value-of select=\"$body.font.master * 1.3\"/>\n" +
"    <xsl:text>pt</xsl:text>\n" +
"  </xsl:attribute>\n" +
"  <xsl:attribute name=\"color\">\n" +
"    <xsl:value-of select=\"$section.title.l3.color\"/>\n" +
"  </xsl:attribute>\n" +
//"  <xsl:attribute name=\"font-weight\">bold</xsl:attribute>\n" +
"</xsl:attribute-set>\n" +
"\n" +
"<xsl:attribute-set name=\"section.title.level4.properties\">\n" +
"  <xsl:attribute name=\"font-size\">\n" +
"    <xsl:value-of select=\"$body.font.master * 1.1\"/>\n" +
"    <xsl:text>pt</xsl:text>\n" +
"  </xsl:attribute>\n" +
"  <xsl:attribute name=\"color\">\n" +
"    <xsl:value-of select=\"$section.title.l4.color\"/>\n" +
"  </xsl:attribute>\n" +
"</xsl:attribute-set>\n" +
"\n" +
"<xsl:attribute-set name=\"section.title.level5.properties\">\n" +
"  <xsl:attribute name=\"font-size\">\n" +
"    <xsl:value-of select=\"$body.font.master\"/>\n" +
"    <xsl:text>pt</xsl:text>\n" +
"    <xsl:attribute name=\"color\">\n" +
"      <xsl:value-of select=\"$section.title.l5.color\"/>\n" +
"    </xsl:attribute>\n" +
"  </xsl:attribute>\n" +
"</xsl:attribute-set>\n" +
"\n" +
"<xsl:attribute-set name=\"section.title.level6.properties\">\n" +
"  <xsl:attribute name=\"font-size\">\n" +
"    <xsl:value-of select=\"$body.font.master\"/>\n" +
"    <xsl:text>pt</xsl:text>\n" +
"  </xsl:attribute>\n" +
"  <xsl:attribute name=\"color\">\n" +
"    <xsl:value-of select=\"$section.title.l6.color\"/>\n" +
"  </xsl:attribute>\n" +
"</xsl:attribute-set>\n";
        message+="      <fo:table-body start-indent=\"0pt\">	\n" +
"       <xsl:variable name=\"pgwide\"> \n" +
"    <xsl:choose>\n" +
"      <xsl:when test=\"@pgwide\"> \n" +
"        <xsl:value-of select=\"@pgwide\"/> \n" +
"      </xsl:when>\n" +
"      <xsl:when test=\"$pgwide.pi\">\n" +
"        <xsl:value-of select=\"$pgwide.pi\"/>\n" +
"      </xsl:when>\n" +
"      <!-- child element may set pgwide -->\n" +
"      <xsl:when test=\"*[@pgwide]\">\n" +
"        <xsl:value-of select=\"*[@pgwide][1]/@pgwide\"/>\n" +
"      </xsl:when>\n" +
"    </xsl:choose>\n" +
"  </xsl:variable>\n" +
"  <!-- TAILLE DE LA PAGE, DEFINITION DES DIMENSIONS DE LA PAGE --> \n" +
"  <xsl:choose> \n" +
"    <xsl:when test=\"$pgwide = '1'\">\n" +
"      <fo:block id=\"{$id}\" xsl:use-attribute-sets=\"pgwide.properties informalfigure.properties\">\n" +
"        <xsl:if test=\"$keep.together != ''\"> \n" +
"          <xsl:attribute name=\"keep-together.within-column\"> \n" +
"	    <xsl:value-of select=\"$keep.together\"/> \n" +
"	  </xsl:attribute> \n" +
"       </xsl:if>\n" +
"   \n" +
"	<xsl:call-template name=\"side-by-side\"/> \n" +
"     </fo:block> \n" +
"  </xsl:when> \n" +
"    <xsl:otherwise> \n" +
"      <fo:block id=\"{$id}\" \n" +
"                xsl:use-attribute-sets=\"informalfigure.properties\">\n" +
"        <xsl:if test=\"$keep.together != ''\">\n" +
"          <xsl:attribute name=\"keep-together.within-column\">\n" +
"	    <xsl:value-of select=\"$keep.together\"/>\n" +
"	  </xsl:attribute>\n" +
"        </xsl:if>\n" +
"\n" +
"	<xsl:call-template name=\"side-by-side\"/>\n" +
"      </fo:block>\n" +
"    </xsl:otherwise>\n" +
"  </xsl:choose>\n" +
"</xsl:template>\n" +
"\n" +
"<xsl:template name=\"side-by-side\">\n" +
"  <fo:table table-layout=\"fixed\" width=\"100%\">\n" +
"    <fo:table-column column-width=\"proportional-column-width(1)\"/>\n" +
"    <fo:table-column column-width=\"proportional-column-width(1)\"/>\n" +
"    \n" +
"    <fo:table-body start-indent=\"0pt\">\n" +
"      <fo:table-row>\n" +
"        <fo:table-cell text-align=\"start\">\n" +
"	  <fo:block>\n" +
"	    <xsl:apply-templates select=\"*[not(self::d:mediaobject)]\"/>\n" +
"	  </fo:block>\n" +
"	</fo:table-cell>\n" +
"        <fo:table-cell text-align=\"end\" padding-left=\"1em\">\n" +
"	  <fo:block>\n" +
"	    <xsl:apply-templates select=\"d:mediaobject\"/>\n" +
"	  </fo:block>\n" +
"	</fo:table-cell>\n" +
"     </fo:table-row>\n" +
"    </fo:table-body>\n" +
"  </fo:table>\n" +
"</xsl:template>\n" +
"\n" +
"<!-- ==== Formal Titles ==== -->\n" +
"<xsl:attribute-set name=\"formal.title.properties\">\n" +
"  <!-- Titles for figure, tables, example, ... -->\n" +
"  <xsl:attribute name=\"font-size\">\n" +
"    <xsl:choose>\n" +
"      <xsl:when test=\"count(ancestor::d:listitem) &gt; 0\">8pt</xsl:when>\n" +
"      <xsl:when test=\"../d:listitem\">10pt</xsl:when>\n" +
"      <xsl:otherwise>9pt</xsl:otherwise>\n" +
"    </xsl:choose>\n" +
"  </xsl:attribute>\n" +
"  <xsl:attribute name=\"text-transform\">\n" +
"    <xsl:choose>\n" +
"      <xsl:when test=\"count(ancestor::d:listitem) &gt; 0\">uppercase</xsl:when>\n" +
"      <xsl:otherwise>none</xsl:otherwise>\n" +
"    </xsl:choose>\n" +
"  </xsl:attribute>\n" +
"  <xsl:attribute name=\"text-align\">\n" +
"    <xsl:choose>\n" +
"      <xsl:when test=\"self::d:figure or self::d:table\">center</xsl:when>\n" +
"      <xsl:otherwise>start</xsl:otherwise>\n" +
"    </xsl:choose>\n" +
"  </xsl:attribute>\n" +
"</xsl:attribute-set>\n" +
"\n" +
"\n" +
"<!-- ==== Tables ==== -->\n" +
"<!--\n" +
"    Outmost borders of the table\n" +
"-->\n" +
"<xsl:param name=\"default.table.frame\">all</xsl:param>\n" +
"<xsl:param name=\"table.frame.border.thickness\">0.5pt</xsl:param>\n" +
"<xsl:param name=\"table.frame.border.style\">solid</xsl:param>\n" +
"<xsl:param name=\"table.frame.border.color\">black</xsl:param>\n" +
"\n" +
"<xsl:attribute-set name=\"table.cell.padding\">\n" +
"  <xsl:attribute name=\"padding-start\">2pt</xsl:attribute>\n" +
"  <xsl:attribute name=\"padding-end\">2pt</xsl:attribute>\n" +
"  <xsl:attribute name=\"padding-top\">2pt</xsl:attribute>\n" +
"  <xsl:attribute name=\"padding-bottom\">2pt</xsl:attribute>\n" +
"</xsl:attribute-set>\n" +
"\n" +
"<!--\n" +
"    Cell Borders (see configurator)\n" +
"-->\n" +
"<xsl:template name=\"border\">\n" +
"  <xsl:param name=\"side\" select=\"'start'\"/>\n" +
"\n" +
"  <xsl:attribute name=\"border-{$side}-width\">\n" +
"    <xsl:value-of select=\"$table.cell.border.thickness\"/>\n" +
"  </xsl:attribute>\n" +
"  <xsl:attribute name=\"border-{$side}-style\">\n" +
"    <xsl:value-of select=\"$table.cell.border.style\"/>\n" +
"  </xsl:attribute>\n" +
"  <xsl:attribute name=\"border-{$side}-color\">\n" +
"    <xsl:choose>\n" +
"      <xsl:when test=\"ancestor::d:thead\">#ffffff</xsl:when>\n" +
"      <xsl:otherwise>\n" +
"	<xsl:value-of select=\"$table.cell.border.color\"/>\n" +
"      </xsl:otherwise>\n" +
"    </xsl:choose>\n" +
"  </xsl:attribute>\n" +
"</xsl:template>\n" +
"\n" +
"<xsl:attribute-set name=\"table.table.properties\">\n" +
"  <xsl:attribute name=\"text-align\">start</xsl:attribute>\n" +
"</xsl:attribute-set>\n" +
"\n" +
"<!-- Expand this template to add properties to any cell's block -->\n" +
"<xsl:template name=\"table.cell.block.properties\">\n" +
"  <!-- highlight this entry? -->\n" +
"  <xsl:if test=\"ancestor::d:thead or ancestor::d:tfoot\">\n" +
"    <xsl:attribute name=\"font-weight\">bold</xsl:attribute>\n" +
"  </xsl:if>\n" +
"</xsl:template>\n" +
"\n" +
"<!-- Often used to add a background color to table headers -->\n" +
"<xsl:template name=\"table.row.properties\">\n" +
"\n" +
"  <xsl:variable name=\"row-height\">\n" +
"    <xsl:if test=\"processing-instruction('dbfo')\">\n" +
"      <xsl:call-template name=\"pi.dbfo_row-height\"/>\n" +
"    </xsl:if>\n" +
"  </xsl:variable>\n" +
"\n" +
"  <xsl:if test=\"$row-height != ''\">\n" +
"    <xsl:attribute name=\"block-progression-dimension\">\n" +
"      <xsl:value-of select=\"$row-height\"/>\n" +
"    </xsl:attribute>\n" +
"  </xsl:if>\n" +
"\n" +
"  <xsl:variable name=\"bgcolor\">\n" +
"    <xsl:call-template name=\"pi.dbfo_bgcolor\"/>\n" +
"  </xsl:variable>\n" +
"\n" +
"  <xsl:choose>\n" +
"    <xsl:when test=\"$bgcolor != ''\">\n" +
"      <xsl:attribute name=\"background-color\">\n" +
"	<xsl:value-of select=\"$bgcolor\"/>\n" +
"      </xsl:attribute>\n" +
"    </xsl:when>\n" +
"    <xsl:when test=\"ancestor::d:thead\">\n" +
"      <xsl:attribute name=\"background-color\">black</xsl:attribute>\n" +
"    </xsl:when>\n" +
"  </xsl:choose>\n" +
"\n" +
"  <!-- Keep header row with next row -->\n" +
"  <xsl:if test=\"ancestor::d:thead\">\n" +
"    <xsl:attribute name=\"keep-with-next.within-column\">always</xsl:attribute>\n" +
"    <xsl:attribute name=\"color\">white</xsl:attribute> \n" +
"    <xsl:attribute name=\"text-align\">center</xsl:attribute>\n" +
" </xsl:if>\n" +
"\n" +
" <xsl:attribute name=\"keep-together.within-column\">always</xsl:attribute>\n" +
"</xsl:template>\n" +
"\n" +
"<xsl:template name=\"table.cell.properties\">\n" +
"  <xsl:param name=\"bgcolor.pi\" select=\"''\"/>\n" +
"  <xsl:param name=\"rowsep.inherit\" select=\"1\"/>\n" +
"  <xsl:param name=\"colsep.inherit\" select=\"1\"/>\n" +
"  <xsl:param name=\"col\" select=\"1\"/>\n" +
"  <xsl:param name=\"valign.inherit\" select=\"''\"/>\n" +
"  <xsl:param name=\"align.inherit\" select=\"''\"/>\n" +
"  <xsl:param name=\"char.inherit\" select=\"''\"/>\n" +
"\n" +
"  <xsl:choose>\n" +
"    <xsl:when test=\"ancestor::d:tgroup\">\n" +
"      <xsl:choose>\n" +
"	<xsl:when test=\"$bgcolor.pi != ''\">\n" +
"          <xsl:attribute name=\"background-color\">\n" +
"            <xsl:value-of select=\"$bgcolor.pi\"/>\n" +
"          </xsl:attribute>\n" +
"	</xsl:when>\n" +
"	<xsl:when test=\"@remap\">\n" +
"	  <xsl:variable name=\"bgcolor\" select=\"normalize-space(substring-before(@remap, ';'))\"/>\n" +
"	  <xsl:variable name=\"color\" select=\"normalize-space(substring-after(@remap, ';'))\"/>\n" +
"\n" +
"	  <xsl:if test=\"translate($bgcolor, '0123456789abcdefABCDEF', '%%%%%%%%%%%%%%%%%%%%%%') = '#%%%%%%'\">\n" +
"              <xsl:value-of select=\"$bgcolor\"/>\n" +
"            </xsl:attribute>\n" +
"	  </xsl:if>\n" +
"\n" +
"	  <xsl:if test=\"translate($color, '0123456789abcdefABCDEF', '%%%%%%%%%%%%%%%%%%%%%%') = '#%%%%%%'\">\n" +
"            <xsl:attribute name=\"color\">\n" +
"              <xsl:value-of select=\"$color\"/>\n" +
"            </xsl:attribute>\n" +
"	  </xsl:if>\n" +
"	</xsl:when>\n" +
"      </xsl:choose>\n" +
"\n" +
"      <xsl:if test=\"$rowsep.inherit &gt; 0\">\n" +
"        <xsl:call-template name=\"border\">\n" +
"          <xsl:with-param name=\"side\" select=\"'bottom'\"/>\n" +
"        </xsl:call-template>\n" +
"      </xsl:if>\n" +
"\n" +
"      <xsl:if test=\"$colsep.inherit &gt; 0 and $col &lt; (ancestor::d:tgroup/@cols|ancestor::d:entrytbl/@cols)[last()]\">\n" +
"        <xsl:call-template name=\"border\">\n" +
"          <xsl:with-param name=\"side\" select=\"'end'\"/>\n" +
"        </xsl:call-template>\n" +
"      </xsl:if>\n" +
"\n" +
"      <xsl:if test=\"$valign.inherit != ''\">\n" +
"       <xsl:attribute name=\"display-align\">\n" +
"          <xsl:choose>\n" +
"            <xsl:when test=\"$valign.inherit='top'\">before</xsl:when>\n" +
"            <xsl:when test=\"$valign.inherit='middle'\">center</xsl:when>\n" +
"            <xsl:when test=\"$valign.inherit='bottom'\">after</xsl:when>\n" +
"            <xsl:otherwise>\n" +
"              <xsl:message>\n" +
"                <xsl:text>Unexpected valign value: </xsl:text>\n" +
"                <xsl:value-of select=\"$valign.inherit\"/>\n" +
"                <xsl:text>, center used.</xsl:text>\n" +
"              </xsl:message>\n" +
"              <xsl:text>center</xsl:text>\n" +
"            </xsl:otherwise>\n" +
"          </xsl:choose>\n" +
"        </xsl:attribute>\n" +
"     </xsl:if>\n" +
"\n" +
"      <xsl:choose>\n" +
"        <xsl:when test=\"$align.inherit = 'char' and $char.inherit != ''\">\n" +
"          <xsl:attribute name=\"text-align\">\n" +
"            <xsl:value-of select=\"$char.inherit\"/>\n" +
"          </xsl:attribute>\n" +
"        </xsl:when>\n" +
"        <xsl:when test=\"$align.inherit != ''\">\n" +
"          <xsl:attribute name=\"text-align\">\n" +
"            <xsl:value-of select=\"$align.inherit\"/>\n" +
"          </xsl:attribute>\n" +
"        </xsl:when>\n" +
"      </xsl:choose>\n" +
"\n" +
"    </xsl:when>\n" +
"    <xsl:otherwise>\n" +
"      <!-- HTML table -->\n" +
"      <xsl:if test=\"$bgcolor.pi != ''\">\n" +
"        <xsl:attribute name=\"background-color\">\n" +
"          <xsl:value-of select=\"$bgcolor.pi\"/>\n" +
"        </xsl:attribute>\n" +
"      </xsl:if>\n" +
"\n" +
"      <xsl:if test=\"$align.inherit != ''\">\n" +
"        <xsl:attribute name=\"text-align\">\n" +
"          <xsl:value-of select=\"$align.inherit\"/>\n" +
"        </xsl:attribute>\n" +
"      </xsl:if>\n" +
"\n" +
"      <xsl:if test=\"$valign.inherit != ''\">\n" +
"        <xsl:attribute name=\"display-align\">\n" +
"          <xsl:choose>\n" +
"            <xsl:when test=\"$valign.inherit='top'\">before</xsl:when>\n" +
"            <xsl:when test=\"$valign.inherit='middle'\">center</xsl:when>\n" +
"            <xsl:when test=\"$valign.inherit='bottom'\">after</xsl:when>\n" +
"            <xsl:otherwise>\n" +
"              <xsl:message>\n" +
"                <xsl:text>Unexpected valign value: </xsl:text>\n" +
"                <xsl:value-of select=\"$valign.inherit\"/>\n" +
"                <xsl:text>, center used.</xsl:text>\n" +
"              </xsl:message>\n" +
"              <xsl:text>center</xsl:text>\n" +
"            </xsl:otherwise>\n" +
"          </xsl:choose>\n" +
"        </xsl:attribute>\n" +
"      </xsl:if>\n" +
"\n" +
"      <xsl:call-template name=\"html.table.cell.rules\"/>\n" +
"\n" +
"    </xsl:otherwise>\n" +
"  </xsl:choose>\n" +
"\n" +
"</xsl:template>\n" +
"\n" +
"<!-- ==== Admonitions ==== -->\n" +
"<xsl:param name=\"admon.graphics\" select=\"1\"></xsl:param>\n" +
"<!--\n" +
"    Calenco will resolve these URIs to local ones.\n" +
"-->\n" +
"<xsl:param name=\"admon.graphics.path\"></xsl:param><!-- CUSTOM -->\n" +
"\n" +
"<xsl:param name=\"admon.graphics.extension\">.png</xsl:param><!-- CUSTOM -->\n" +
"\n" +
"<xsl:param name=\"admon.textlabel\" select=\"0\"></xsl:param>\n" +
"\n" +
"<xsl:attribute-set name=\"admonition.title.properties\">\n" +
"\n" +
"</xsl:attribute-set>\n" +
"\n" +
"<xsl:attribute-set name=\"admonition.properties\">\n" +
"  <!-- Inner Content -->\n" +
"</xsl:attribute-set>\n" +
"\n" +
"<xsl:attribute-set name=\"graphical.admonition.properties\">\n" +
"  <!-- When <xsl:param name=\"admon.graphics\" select=\"1\"></xsl:param> -->\n" +
"  <xsl:attribute name=\"font-weight\">bold</xsl:attribute>\n" +
"</xsl:attribute-set>\n" +
"\n" +
"<xsl:attribute-set name=\"nongraphical.admonition.properties\">\n" +
"  <!-- When <xsl:param name=\"admon.graphics\" select=\"0\"></xsl:param> -->\n" +
"</xsl:attribute-set>\n" +
"\n" +
"<!-- ==== Call Outs ==== -->\n" +
"<!--\n" +
"    Calenco will resolve these URIs to local ones.\n" +
"-->\n" +
"<xsl:param name=\"callout.graphics.path\">http://docbook.sourceforge.net/release/xsl-ns/current/images/callouts/</xsl:param><!-- CUSTOM -->\n" +
"\n" +
"\n" +
"<!-- ==== Lists ==== -->\n" +
"<xsl:attribute-set name=\"list.item.spacing\">\n" +
"  <!-- This is almost always considered too much -->\n" +
"  <xsl:attribute name=\"space-before.optimum\">0.4em</xsl:attribute>\n" +
"  <xsl:attribute name=\"space-before.minimum\">0.3em</xsl:attribute>\n" +
"  <xsl:attribute name=\"space-before.maximum\">0.5em</xsl:attribute>\n" +
"</xsl:attribute-set>\n" +
"\n" +
"<!--\n" +
"    See: http://www.sagehill.net/docbookxsl/Itemizedlists.html#DiffBulletSymbol-->\n" +
"<xsl:template name=\"next.itemsymbol\">\n" +
"  <xsl:param name=\"itemsymbol\" select=\"'default'\"/>\n" +
"  <xsl:choose>\n" +
"    <!-- Change this list if you want to change the order of symbols -->\n" +
"    <xsl:when test=\"$itemsymbol = 'disc'\">circle</xsl:when>\n" +
"    <xsl:when test=\"$itemsymbol = 'circle'\">square</xsl:when>\n" +
"    <xsl:otherwise>disc</xsl:otherwise>\n" +
"  </xsl:choose>\n" +
"</xsl:template>\n" +
"\n" +
"<!-- ==== Verbatim (program listings, screens, ...) ==== -->\n" +
"<!--\n" +
"    Hyphenate program listings and screens\n" +
"-->\n" +
"<xsl:param name=\"hyphenate.verbatim\" select=\"1\" />\n" +
"\n" +
"<!-- \n" +
"     Put in this parameter characters whose after a line break can occur.\n" +
"     (the space character is included by default)\n" +
"-->\n" +
"<xsl:param name=\"hyphenate.verbatim.characters\"></xsl:param>\n" +
"\n" +
"<xsl:attribute-set name=\"monospace.verbatim.properties\">\n" +
"  <!--\n" +
"      See: http://www.sagehill.net/docbookxsl/ProgramListings.html#FormatListings\n" +
"  -->\n" +
"</xsl:attribute-set>\n" +
"\n" +
"<xsl:template match=\"*\" mode=\"admon.graphic.width\">\n" +
"  <xsl:text>20pt</xsl:text>\n" +
"</xsl:template>\n" +
"\n" +
"<xsl:template name=\"graphical.admonition\">\n" +
"  <xsl:variable name=\"id\">\n" +
"    <xsl:call-template name=\"object.id\"/>\n" +
"  </xsl:variable>\n" +
"  <xsl:variable name=\"graphic.width\">\n" +
"     <xsl:apply-templates select=\".\" mode=\"admon.graphic.width\"/>\n" +
"  </xsl:variable>\n" +
"\n" +
"  <fo:block id=\"{$id}\"\n" +
"            xsl:use-attribute-sets=\"graphical.admonition.properties\">\n" +
"    <fo:list-block provisional-distance-between-starts=\"{$graphic.width} + 10pt\"\n" +
"                    provisional-label-separation=\"10pt\">\n" +
"      <fo:list-item>\n" +
"          <fo:list-item-label end-indent=\"label-end()\">\n" +
"            <fo:block>\n" +
"              <fo:external-graphic width=\"auto\" height=\"auto\"\n" +
"                                         content-width=\"{$graphic.width}\" >\n" +
"                <xsl:attribute name=\"src\">\n" +
"                  <xsl:call-template name=\"admon.graphic\"/>\n" +
"                </xsl:attribute>\n" +
"              </fo:external-graphic>\n" +
"            </fo:block>\n" +
"          </fo:list-item-label>\n" +
"          <fo:list-item-body start-indent=\"body-start()\">\n" +
"            <xsl:if test=\"$admon.textlabel != 0 or d:title or d:info/d:title\">\n" +
"              <fo:block xsl:use-attribute-sets=\"admonition.title.properties\">\n" +
"                <xsl:apply-templates select=\".\" mode=\"object.title.markup\">\n" +
"		  <xsl:with-param name=\"allow-anchors\" select=\"1\"/>\n" +
"		</xsl:apply-templates>\n" +
"              </fo:block>\n" +
"            </xsl:if>\n" +
"            <fo:block xsl:use-attribute-sets=\"admonition.properties\">\n" +
"              <xsl:apply-templates/>\n" +
"            </fo:block>\n" +
"          </fo:list-item-body>\n" +
"      </fo:list-item>\n" +
"    </fo:list-block>\n" +
"  </fo:block>\n" +
"</xsl:template>\n" +
"\n" +
"<!-- ==== Inline ==== -->\n" +
"<xsl:attribute-set name=\"xref.properties\">\n" +
"  <xsl:attribute name=\"font-weight\">bold</xsl:attribute>\n" +
" <xsl:attribute name=\"font-style\">italic</xsl:attribute>\n" +
"</xsl:attribute-set>\n" +
"\n" +
"<xsl:template match=\"*\" mode=\"page.citation\">\n" +
"<xsl:param name=\"id\" select=\"'???'\"/>\n" +
"\n" +
"  <fo:basic-link internal-destination=\"{$id}\">\n" +
"    <fo:inline keep-together.within-line=\"always\">\n" +
"      <xsl:call-template name=\"substitute-markup\">\n" +
"        <xsl:with-param name=\"template\">\n" +
"          <xsl:call-template name=\"gentext.template\">\n" +
"            <xsl:with-param name=\"name\" select=\"'page.citation'\"/>\n" +
"            <xsl:with-param name=\"context\" select=\"'xref'\"/>\n" +
"          </xsl:call-template>\n" +
"        </xsl:with-param>\n" +
"     </xsl:call-template>\n" +
"    </fo:inline>\n" +
" </fo:basic-link>\n" +
"</xsl:template>\n" +
"\n" +
"<!-- ==== Images ==== -->\n" +
"<!-- Add border when remap=\"cadre\" -->\n" +
"<xsl:template name=\"process.image\">\n" +
"  <!-- When this template is called, the current node should be  -->\n" +
"  <!-- a graphic, inlinegraphic, imagedata, or videodata. All    -->\n" +
"  <!-- those elements have the same set of attributes, so we can -->\n" +
"  <!-- handle them all in one place.                             -->\n" +
"\n" +
"  <xsl:variable name=\"scalefit\">\n" +
"    <xsl:choose>\n" +
"      <xsl:when test=\"$ignore.image.scaling != 0\">0</xsl:when>\n" +
"      <xsl:when test=\"@contentwidth\">0</xsl:when>\n" +
"      <xsl:when test=\"@contentdepth and \n" +
"                     @contentdepth != '100%'\">0</xsl:when>\n" +
"      <xsl:when test=\"@scale\">0</xsl:when>\n" +
"      <xsl:when test=\"@scalefit\"><xsl:value-of select=\"@scalefit\"/></xsl:when>\n" +
"      <xsl:when test=\"@width or @depth\">1</xsl:when>\n" +
"      <xsl:when test=\"$default.image.width != ''\">1</xsl:when>\n" +
"      <xsl:otherwise>0</xsl:otherwise>\n" +
"    </xsl:choose>\n" +
"  </xsl:variable>\n" +
"\n" +
"  <xsl:variable name=\"scale\">\n" +
"    <xsl:choose>\n" +
"      <xsl:when test=\"$ignore.image.scaling != 0\">0</xsl:when>\n" +
"      <xsl:when test=\"@contentwidth or @contentdepth\">1.0</xsl:when>\n" +
"      <xsl:when test=\"@scale\">\n" +
"        <xsl:value-of select=\"@scale div 100.0\"/>\n" +
"      </xsl:when>\n" +
"      <xsl:otherwise>1.0</xsl:otherwise>\n" +
"    </xsl:choose>\n" +
"  </xsl:variable>\n" +
"\n" +
"  <xsl:variable name=\"filename\">\n" +
"    <xsl:choose>\n" +
"      <xsl:when test=\"local-name(.) = 'graphic'\n" +
"                      or local-name(.) = 'inlinegraphic'\">\n" +
"        <!-- handle legacy graphic and inlinegraphic by new template --> \n" +
"        <xsl:call-template name=\"mediaobject.filename\">\n" +
"          <xsl:with-param name=\"object\" select=\".\"/>\n" +
"        </xsl:call-template>\n" +
"      </xsl:when>\n" +
"      <xsl:otherwise>\n" +
"        <!-- imagedata, videodata, audiodata -->\n" +
"        <xsl:call-template name=\"mediaobject.filename\">\n" +
"          <xsl:with-param name=\"object\" select=\"..\"/>\n" +
"        </xsl:call-template>\n" +
"      </xsl:otherwise>\n" +
"    </xsl:choose>\n" +
"  </xsl:variable>\n" +
"\n" +
"  <xsl:variable name=\"content-type\">\n" +
"    <xsl:if test=\"@format\">\n" +
"      <xsl:call-template name=\"graphic.format.content-type\">\n" +
"        <xsl:with-param name=\"format\" select=\"@format\"/>\n" +
"      </xsl:call-template>\n" +
"    </xsl:if>\n" +
"  </xsl:variable>\n" +
"\n" +
"  <xsl:variable name=\"bgcolor\">\n" +
"    <xsl:call-template name=\"pi.dbfo_background-color\">\n" +
"      <xsl:with-param name=\"node\" select\"..\"/>\n" +
"    </xsl:call-template>\n" +
"  </xsl:variable>\n" +
"\n" +
"  <fo:external-graphic>\n" +
"    <xsl:if test=\"@remap = 'cadre'\">\n" +
"      <xsl:attribute name=\"border\">0.8pt solid black</xsl:attribute>\n" +
"    </xsl:if>\n" +
"\n" +
"    <xsl:attribute name=\"src\">\n" +
"      <xsl:call-template name=\"fo-external-image\">\n" +
"        <xsl:with-param name=\"filename\">\n" +
"          <xsl:if test=\"$img.src.path != '' and \n" +
"                        not(starts-with($filename, '/')) and\n" +
"                        not(contains($filename, '://'))\">\n" +
"            <xsl:value-of select=\"$img.src.path\"/>\n" +
"          </xsl:if>\n" +
"          <xsl:value-of select=\"$filename\"/>\n" +
"        </xsl:with-param>\n" +
"      </xsl:call-template>\n" +
"    </xsl:attribute>\n" +
"\n" +
"    <xsl:attribute name=\"width\">\n" +
"      <xsl:choose>\n" +
"        <xsl:when test=\"$ignore.image.scaling != 0\">auto</xsl:when>\n" +
"        <xsl:when test=\"contains(@width,'%')\">\n" +
"          <xsl:value-of select=\"@width\"/>\n" +
"        </xsl:when>\n" +
"        <xsl:when test=\"@width and not(@width = '')\">\n" +
"          <xsl:call-template name=\"length-spec\">\n" +
"            <xsl:with-param name=\"length\" select=\"@width\"/>\n" +
"            <xsl:with-param name=\"default.units\" select=\"'px'\"/>\n" +
"          </xsl:call-template>\n" +
"        </xsl:when>\n" +
"        <xsl:when test=\"not(@depth) and $default.image.width != ''\">\n" +
"          <xsl:call-template name=\"length-spec\">\n" +
"            <xsl:with-param name=\"length\" select=\"$default.image.width\"/>\n" +
"            <xsl:with-param name=\"default.units\" select=\"'px'\"/>\n" +
"          </xsl:call-template>\n" +
"        </xsl:when>\n" +
"       <xsl:otherwise>\n" +
"	  <xsl:choose>\n" +
"	    <xsl:when test=\"ancestor-or-self::d:inlinemediaobject\">auto</xsl:when>\n" +
"	    <xsl:otherwise>100%</xsl:otherwise>\n" +
"	  </xsl:choose>\n" +
"	</xsl:otherwise>\n" +
"      </xsl:choose>\n" +
"    </xsl:attribute>\n" +
"\n" +
"    <xsl:attribute name=\"height\">\n" +
"      <xsl:choose>\n" +
"        <xsl:when test=\"$ignore.image.scaling != 0\">auto</xsl:when>\n" +
"        <xsl:when test=\"contains(@depth,'%')\">\n" +
"          <xsl:value-of select=\"@depth\"/>\n" +
"        </xsl:when>\n" +
"        <xsl:when test=\"@depth\">\n" +
"          <xsl:call-template name=\"length-spec\">\n" +
"            <xsl:with-param name=\"length\" select=\"@depth\"/>\n" +
"            <xsl:with-param name=\"default.units\" select=\"'px'\"/>\n" +
"          </xsl:call-template>\n" +
"        </xsl:when>\n" +
"        <xsl:otherwise>auto</xsl:otherwise>\n" +
"      </xsl:choose>\n" +
"    </xsl:attribute>\n" +
"\n" +
"    <xsl:attribute name=\"content-width\">\n" +
"      <xsl:choose>\n" +
"        <xsl:when test=\"$ignore.image.scaling != 0\">auto</xsl:when>\n" +
"       <xsl:when test=\"contains(@contentwidth,'%')\">\n" +
"          <xsl:value-of select=\"@contentwidth\"/>\n" +
"        </xsl:when>\n" +
"        <xsl:when test=\"@contentwidth\">\n" +
"          <xsl:call-template name=\"length-spec\">\n" +
"            <xsl:with-param name=\"length\" select=\"@contentwidth\"/>\n" +
"            <xsl:with-param name=\"default.units\" select=\"'px'\"/>\n" +
"          </xsl:call-template>\n" +
"        </xsl:when>\n" +
"        <xsl:when test=\"number($scale) != 1.0\">\n" +
"          <xsl:value-of select=\"$scale * 100\"/>\n" +
"          <xsl:text>%</xsl:text>\n" +
"        </xsl:when>\n" +
"        <xsl:when test=\"$scalefit = 1\">scale-to-fit</xsl:when>\n" +
"        <xsl:otherwise>scale-down-to-fit</xsl:otherwise>\n" +
"      </xsl:choose>\n" +
"    </xsl:attribute>\n" +
"\n" +
"    <xsl:attribute name=\"content-height\">\n" +
"      <xsl:choose>\n" +
"        <xsl:when test=\"$ignore.image.scaling != 0\">auto</xsl:when>\n" +
"        <xsl:when test=\"contains(@contentdepth,'%')\">\n" +
"          <xsl:value-of select=\"@contentdepth\"/>\n" +
"        </xsl:when>\n" +
"        <xsl:when test=\"@contentdepth\">\n" +
"         <xsl:call-template name=\"length-spec\">\n" +
"            <xsl:with-param name=\"length\" select=\"@contentdepth\"/>\n" +
"           <xsl:with-param name=\"default.units\" select=\"'px'\"/>\n" +
"          </xsl:call-template>\n" +
"        </xsl:when>\n" +
"        <xsl:when test=\"number($scale) != 1.0\">\n" +
"          <xsl:value-of select=\"$scale * 100\"/>\n" +
"          <xsl:text>%</xsl:text>\n" +
"        </xsl:when>\n" +
"        <xsl:when test=\"$scalefit = 1\">scale-to-fit</xsl:when>\n" +
"        <xsl:otherwise>auto</xsl:otherwise>\n" +
"      </xsl:choose>\n" +
"    </xsl:attribute>\n" +
"\n" +
"    <xsl:if test=\"$content-type != ''\">\n" +
"      <xsl:attribute name=\"content-type\">\n" +
"        <xsl:value-of select=\"concat('content-type:',$content-type)\"/>\n" +
"      </xsl:attribute>\n" +
"    </xsl:if>\n" +
"<!-- COULEUR DU FOND D ECRAN -->\n" +
"    <xsl:if test=\"$bgcolor != ''\">\n" +
"      <xsl:attribute name=\"background-color\">\n" +
"        <xsl:value-of select=\"$bgcolor\"/>\n" +
"      </xsl:attribute>\n" +
"    </xsl:if>\n" +
"<!-- ALIGNEMENT DU TEXTE -->\n" +
"    <xsl:if test=\"@align\">\n" +
"      <xsl:attribute name=\"text-align\">\n" +
"        <xsl:value-of select=\"@align\"/>\n" +
"      </xsl:attribute>\n" +
"    </xsl:if>\n" +
"<!-- ALIGNEMENT VERTICAL DU TEXTE -->\n" +
"    <xsl:if test=\"@valign\">\n" +
"      <xsl:attribute name=\"display-align\">\n" +
"        <xsl:choose>\n" +
"          <xsl:when test=\"@valign = 'top'\">before</xsl:when>\n" +
"          <xsl:when test=\"@valign = 'middle'\">center</xsl:when>\n" +
"          <xsl:when test=\"@valign = 'bottom'\">after</xsl:when>\n" +
"          <xsl:otherwise>auto</xsl:otherwise>\n" +
"        </xsl:choose>\n" +
"      </xsl:attribute>\n" +
"    </xsl:if>\n" +
"\n" +
"    <xsl:if test=\"ancestor-or-self::d:inlinemediaobject\">\n" +
"      <xsl:attribute name=\"alignment-baseline\">middle</xsl:attribute>\n" +
"    </xsl:if>\n" +
"  </fo:external-graphic>\n" +
"</xsl:template>\n" +
"\n" +
"\n" +
"</xsl:stylesheet>\n";
    
        return message;
    }
    
    public static String getPdfbase(){
        String message;
        message=PdfBase();
        return message;
    }
    
    public static String getPdf(){
        String pdf;
        pdf=Pdf();
        return pdf;
    }
    
    //methode pour sauvegarder le fichier xsl
    public static void save() throws FileNotFoundException, IOException{
        
    
        JFileChooser chooser=new JFileChooser();
        chooser.setCurrentDirectory(new File("/home/me/Documents"));
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int retrival = chooser.showSaveDialog(null);
    
        String path = chooser.getSelectedFile().getAbsolutePath() ;
       
        String pdf;
        String pdfbase ;
        
        pdf=getPdf();
        pdfbase=getPdfbase();
        
        File fil=new File(path+"\\pdf-"+Entreprise()+".xsl");
        File file=new File(path+"\\pdf-"+Entreprise()+"-base.xsl");
        
        DataOutputStream fos = null;
        DataOutputStream fros = null;

        // On instancie nos objets :
        // fos va écrire dans le nouveau fichier !
       
        fos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
        fros = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fil)));
        fros.writeBytes(pdf);
        fos.writeBytes(pdfbase);
        fil.createNewFile();
        file.createNewFile();
        
        fros.close();
        fos.close();

    }
    
}
