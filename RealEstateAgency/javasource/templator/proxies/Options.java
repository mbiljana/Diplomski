// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package templator.proxies;

/**
 * for full documentation check 
 * https://github.com/puppeteer/puppeteer/blob/master/docs/api.md#pagepdfoptions
 * 
 * If you change the default values it will impact all generated documents.
 */
public class Options
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject optionsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Templator.Options";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Scale("Scale"),
		Layout("Layout"),
		PaperFormat("PaperFormat"),
		MarginTop("MarginTop"),
		MarginBottom("MarginBottom"),
		MarginLeft("MarginLeft"),
		MarginRight("MarginRight"),
		DisplayHeaderFooter("DisplayHeaderFooter"),
		HeaderTemplate("HeaderTemplate"),
		FooterTemplate("FooterTemplate"),
		PrintBackground("PrintBackground"),
		PageRanges("PageRanges"),
		Width("Width"),
		Height("Height"),
		PreferCSSPageSize("PreferCSSPageSize"),
		HideControlElements("HideControlElements"),
		HideDialogs("HideDialogs"),
		HideValidations("HideValidations"),
		DisableBootstrapPrintStyling("DisableBootstrapPrintStyling");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Options(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Templator.Options"));
	}

	protected Options(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject optionsMendixObject)
	{
		if (optionsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Templator.Options", optionsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Templator.Options");

		this.optionsMendixObject = optionsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Options.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static templator.proxies.Options initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return templator.proxies.Options.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static templator.proxies.Options initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new templator.proxies.Options(context, mendixObject);
	}

	public static templator.proxies.Options load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return templator.proxies.Options.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Scale
	 */
	public final java.math.BigDecimal getScale()
	{
		return getScale(getContext());
	}

	/**
	 * @param context
	 * @return value of Scale
	 */
	public final java.math.BigDecimal getScale(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Scale.toString());
	}

	/**
	 * Set value of Scale
	 * @param scale
	 */
	public final void setScale(java.math.BigDecimal scale)
	{
		setScale(getContext(), scale);
	}

	/**
	 * Set value of Scale
	 * @param context
	 * @param scale
	 */
	public final void setScale(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal scale)
	{
		getMendixObject().setValue(context, MemberNames.Scale.toString(), scale);
	}

	/**
	 * Set value of Layout
	 * @param layout
	 */
	public final templator.proxies.ENUM_Layout getLayout()
	{
		return getLayout(getContext());
	}

	/**
	 * @param context
	 * @return value of Layout
	 */
	public final templator.proxies.ENUM_Layout getLayout(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Layout.toString());
		if (obj == null)
			return null;

		return templator.proxies.ENUM_Layout.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Layout
	 * @param layout
	 */
	public final void setLayout(templator.proxies.ENUM_Layout layout)
	{
		setLayout(getContext(), layout);
	}

	/**
	 * Set value of Layout
	 * @param context
	 * @param layout
	 */
	public final void setLayout(com.mendix.systemwideinterfaces.core.IContext context, templator.proxies.ENUM_Layout layout)
	{
		if (layout != null)
			getMendixObject().setValue(context, MemberNames.Layout.toString(), layout.toString());
		else
			getMendixObject().setValue(context, MemberNames.Layout.toString(), null);
	}

	/**
	 * Set value of PaperFormat
	 * @param paperformat
	 */
	public final templator.proxies.ENUM_PaperFormat getPaperFormat()
	{
		return getPaperFormat(getContext());
	}

	/**
	 * @param context
	 * @return value of PaperFormat
	 */
	public final templator.proxies.ENUM_PaperFormat getPaperFormat(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.PaperFormat.toString());
		if (obj == null)
			return null;

		return templator.proxies.ENUM_PaperFormat.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of PaperFormat
	 * @param paperformat
	 */
	public final void setPaperFormat(templator.proxies.ENUM_PaperFormat paperformat)
	{
		setPaperFormat(getContext(), paperformat);
	}

	/**
	 * Set value of PaperFormat
	 * @param context
	 * @param paperformat
	 */
	public final void setPaperFormat(com.mendix.systemwideinterfaces.core.IContext context, templator.proxies.ENUM_PaperFormat paperformat)
	{
		if (paperformat != null)
			getMendixObject().setValue(context, MemberNames.PaperFormat.toString(), paperformat.toString());
		else
			getMendixObject().setValue(context, MemberNames.PaperFormat.toString(), null);
	}

	/**
	 * @return value of MarginTop
	 */
	public final java.lang.String getMarginTop()
	{
		return getMarginTop(getContext());
	}

	/**
	 * @param context
	 * @return value of MarginTop
	 */
	public final java.lang.String getMarginTop(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MarginTop.toString());
	}

	/**
	 * Set value of MarginTop
	 * @param margintop
	 */
	public final void setMarginTop(java.lang.String margintop)
	{
		setMarginTop(getContext(), margintop);
	}

	/**
	 * Set value of MarginTop
	 * @param context
	 * @param margintop
	 */
	public final void setMarginTop(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String margintop)
	{
		getMendixObject().setValue(context, MemberNames.MarginTop.toString(), margintop);
	}

	/**
	 * @return value of MarginBottom
	 */
	public final java.lang.String getMarginBottom()
	{
		return getMarginBottom(getContext());
	}

	/**
	 * @param context
	 * @return value of MarginBottom
	 */
	public final java.lang.String getMarginBottom(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MarginBottom.toString());
	}

	/**
	 * Set value of MarginBottom
	 * @param marginbottom
	 */
	public final void setMarginBottom(java.lang.String marginbottom)
	{
		setMarginBottom(getContext(), marginbottom);
	}

	/**
	 * Set value of MarginBottom
	 * @param context
	 * @param marginbottom
	 */
	public final void setMarginBottom(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String marginbottom)
	{
		getMendixObject().setValue(context, MemberNames.MarginBottom.toString(), marginbottom);
	}

	/**
	 * @return value of MarginLeft
	 */
	public final java.lang.String getMarginLeft()
	{
		return getMarginLeft(getContext());
	}

	/**
	 * @param context
	 * @return value of MarginLeft
	 */
	public final java.lang.String getMarginLeft(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MarginLeft.toString());
	}

	/**
	 * Set value of MarginLeft
	 * @param marginleft
	 */
	public final void setMarginLeft(java.lang.String marginleft)
	{
		setMarginLeft(getContext(), marginleft);
	}

	/**
	 * Set value of MarginLeft
	 * @param context
	 * @param marginleft
	 */
	public final void setMarginLeft(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String marginleft)
	{
		getMendixObject().setValue(context, MemberNames.MarginLeft.toString(), marginleft);
	}

	/**
	 * @return value of MarginRight
	 */
	public final java.lang.String getMarginRight()
	{
		return getMarginRight(getContext());
	}

	/**
	 * @param context
	 * @return value of MarginRight
	 */
	public final java.lang.String getMarginRight(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MarginRight.toString());
	}

	/**
	 * Set value of MarginRight
	 * @param marginright
	 */
	public final void setMarginRight(java.lang.String marginright)
	{
		setMarginRight(getContext(), marginright);
	}

	/**
	 * Set value of MarginRight
	 * @param context
	 * @param marginright
	 */
	public final void setMarginRight(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String marginright)
	{
		getMendixObject().setValue(context, MemberNames.MarginRight.toString(), marginright);
	}

	/**
	 * @return value of DisplayHeaderFooter
	 */
	public final java.lang.Boolean getDisplayHeaderFooter()
	{
		return getDisplayHeaderFooter(getContext());
	}

	/**
	 * @param context
	 * @return value of DisplayHeaderFooter
	 */
	public final java.lang.Boolean getDisplayHeaderFooter(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.DisplayHeaderFooter.toString());
	}

	/**
	 * Set value of DisplayHeaderFooter
	 * @param displayheaderfooter
	 */
	public final void setDisplayHeaderFooter(java.lang.Boolean displayheaderfooter)
	{
		setDisplayHeaderFooter(getContext(), displayheaderfooter);
	}

	/**
	 * Set value of DisplayHeaderFooter
	 * @param context
	 * @param displayheaderfooter
	 */
	public final void setDisplayHeaderFooter(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean displayheaderfooter)
	{
		getMendixObject().setValue(context, MemberNames.DisplayHeaderFooter.toString(), displayheaderfooter);
	}

	/**
	 * @return value of HeaderTemplate
	 */
	public final java.lang.String getHeaderTemplate()
	{
		return getHeaderTemplate(getContext());
	}

	/**
	 * @param context
	 * @return value of HeaderTemplate
	 */
	public final java.lang.String getHeaderTemplate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.HeaderTemplate.toString());
	}

	/**
	 * Set value of HeaderTemplate
	 * @param headertemplate
	 */
	public final void setHeaderTemplate(java.lang.String headertemplate)
	{
		setHeaderTemplate(getContext(), headertemplate);
	}

	/**
	 * Set value of HeaderTemplate
	 * @param context
	 * @param headertemplate
	 */
	public final void setHeaderTemplate(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String headertemplate)
	{
		getMendixObject().setValue(context, MemberNames.HeaderTemplate.toString(), headertemplate);
	}

	/**
	 * @return value of FooterTemplate
	 */
	public final java.lang.String getFooterTemplate()
	{
		return getFooterTemplate(getContext());
	}

	/**
	 * @param context
	 * @return value of FooterTemplate
	 */
	public final java.lang.String getFooterTemplate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FooterTemplate.toString());
	}

	/**
	 * Set value of FooterTemplate
	 * @param footertemplate
	 */
	public final void setFooterTemplate(java.lang.String footertemplate)
	{
		setFooterTemplate(getContext(), footertemplate);
	}

	/**
	 * Set value of FooterTemplate
	 * @param context
	 * @param footertemplate
	 */
	public final void setFooterTemplate(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String footertemplate)
	{
		getMendixObject().setValue(context, MemberNames.FooterTemplate.toString(), footertemplate);
	}

	/**
	 * @return value of PrintBackground
	 */
	public final java.lang.Boolean getPrintBackground()
	{
		return getPrintBackground(getContext());
	}

	/**
	 * @param context
	 * @return value of PrintBackground
	 */
	public final java.lang.Boolean getPrintBackground(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.PrintBackground.toString());
	}

	/**
	 * Set value of PrintBackground
	 * @param printbackground
	 */
	public final void setPrintBackground(java.lang.Boolean printbackground)
	{
		setPrintBackground(getContext(), printbackground);
	}

	/**
	 * Set value of PrintBackground
	 * @param context
	 * @param printbackground
	 */
	public final void setPrintBackground(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean printbackground)
	{
		getMendixObject().setValue(context, MemberNames.PrintBackground.toString(), printbackground);
	}

	/**
	 * @return value of PageRanges
	 */
	public final java.lang.String getPageRanges()
	{
		return getPageRanges(getContext());
	}

	/**
	 * @param context
	 * @return value of PageRanges
	 */
	public final java.lang.String getPageRanges(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PageRanges.toString());
	}

	/**
	 * Set value of PageRanges
	 * @param pageranges
	 */
	public final void setPageRanges(java.lang.String pageranges)
	{
		setPageRanges(getContext(), pageranges);
	}

	/**
	 * Set value of PageRanges
	 * @param context
	 * @param pageranges
	 */
	public final void setPageRanges(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String pageranges)
	{
		getMendixObject().setValue(context, MemberNames.PageRanges.toString(), pageranges);
	}

	/**
	 * @return value of Width
	 */
	public final java.lang.String getWidth()
	{
		return getWidth(getContext());
	}

	/**
	 * @param context
	 * @return value of Width
	 */
	public final java.lang.String getWidth(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Width.toString());
	}

	/**
	 * Set value of Width
	 * @param width
	 */
	public final void setWidth(java.lang.String width)
	{
		setWidth(getContext(), width);
	}

	/**
	 * Set value of Width
	 * @param context
	 * @param width
	 */
	public final void setWidth(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String width)
	{
		getMendixObject().setValue(context, MemberNames.Width.toString(), width);
	}

	/**
	 * @return value of Height
	 */
	public final java.lang.String getHeight()
	{
		return getHeight(getContext());
	}

	/**
	 * @param context
	 * @return value of Height
	 */
	public final java.lang.String getHeight(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Height.toString());
	}

	/**
	 * Set value of Height
	 * @param height
	 */
	public final void setHeight(java.lang.String height)
	{
		setHeight(getContext(), height);
	}

	/**
	 * Set value of Height
	 * @param context
	 * @param height
	 */
	public final void setHeight(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String height)
	{
		getMendixObject().setValue(context, MemberNames.Height.toString(), height);
	}

	/**
	 * @return value of PreferCSSPageSize
	 */
	public final java.lang.Boolean getPreferCSSPageSize()
	{
		return getPreferCSSPageSize(getContext());
	}

	/**
	 * @param context
	 * @return value of PreferCSSPageSize
	 */
	public final java.lang.Boolean getPreferCSSPageSize(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.PreferCSSPageSize.toString());
	}

	/**
	 * Set value of PreferCSSPageSize
	 * @param prefercsspagesize
	 */
	public final void setPreferCSSPageSize(java.lang.Boolean prefercsspagesize)
	{
		setPreferCSSPageSize(getContext(), prefercsspagesize);
	}

	/**
	 * Set value of PreferCSSPageSize
	 * @param context
	 * @param prefercsspagesize
	 */
	public final void setPreferCSSPageSize(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean prefercsspagesize)
	{
		getMendixObject().setValue(context, MemberNames.PreferCSSPageSize.toString(), prefercsspagesize);
	}

	/**
	 * @return value of HideControlElements
	 */
	public final java.lang.Boolean getHideControlElements()
	{
		return getHideControlElements(getContext());
	}

	/**
	 * @param context
	 * @return value of HideControlElements
	 */
	public final java.lang.Boolean getHideControlElements(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.HideControlElements.toString());
	}

	/**
	 * Set value of HideControlElements
	 * @param hidecontrolelements
	 */
	public final void setHideControlElements(java.lang.Boolean hidecontrolelements)
	{
		setHideControlElements(getContext(), hidecontrolelements);
	}

	/**
	 * Set value of HideControlElements
	 * @param context
	 * @param hidecontrolelements
	 */
	public final void setHideControlElements(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean hidecontrolelements)
	{
		getMendixObject().setValue(context, MemberNames.HideControlElements.toString(), hidecontrolelements);
	}

	/**
	 * @return value of HideDialogs
	 */
	public final java.lang.Boolean getHideDialogs()
	{
		return getHideDialogs(getContext());
	}

	/**
	 * @param context
	 * @return value of HideDialogs
	 */
	public final java.lang.Boolean getHideDialogs(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.HideDialogs.toString());
	}

	/**
	 * Set value of HideDialogs
	 * @param hidedialogs
	 */
	public final void setHideDialogs(java.lang.Boolean hidedialogs)
	{
		setHideDialogs(getContext(), hidedialogs);
	}

	/**
	 * Set value of HideDialogs
	 * @param context
	 * @param hidedialogs
	 */
	public final void setHideDialogs(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean hidedialogs)
	{
		getMendixObject().setValue(context, MemberNames.HideDialogs.toString(), hidedialogs);
	}

	/**
	 * @return value of HideValidations
	 */
	public final java.lang.Boolean getHideValidations()
	{
		return getHideValidations(getContext());
	}

	/**
	 * @param context
	 * @return value of HideValidations
	 */
	public final java.lang.Boolean getHideValidations(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.HideValidations.toString());
	}

	/**
	 * Set value of HideValidations
	 * @param hidevalidations
	 */
	public final void setHideValidations(java.lang.Boolean hidevalidations)
	{
		setHideValidations(getContext(), hidevalidations);
	}

	/**
	 * Set value of HideValidations
	 * @param context
	 * @param hidevalidations
	 */
	public final void setHideValidations(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean hidevalidations)
	{
		getMendixObject().setValue(context, MemberNames.HideValidations.toString(), hidevalidations);
	}

	/**
	 * @return value of DisableBootstrapPrintStyling
	 */
	public final java.lang.Boolean getDisableBootstrapPrintStyling()
	{
		return getDisableBootstrapPrintStyling(getContext());
	}

	/**
	 * @param context
	 * @return value of DisableBootstrapPrintStyling
	 */
	public final java.lang.Boolean getDisableBootstrapPrintStyling(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.DisableBootstrapPrintStyling.toString());
	}

	/**
	 * Set value of DisableBootstrapPrintStyling
	 * @param disablebootstrapprintstyling
	 */
	public final void setDisableBootstrapPrintStyling(java.lang.Boolean disablebootstrapprintstyling)
	{
		setDisableBootstrapPrintStyling(getContext(), disablebootstrapprintstyling);
	}

	/**
	 * Set value of DisableBootstrapPrintStyling
	 * @param context
	 * @param disablebootstrapprintstyling
	 */
	public final void setDisableBootstrapPrintStyling(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean disablebootstrapprintstyling)
	{
		getMendixObject().setValue(context, MemberNames.DisableBootstrapPrintStyling.toString(), disablebootstrapprintstyling);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return optionsMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final templator.proxies.Options that = (templator.proxies.Options) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "Templator.Options";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}