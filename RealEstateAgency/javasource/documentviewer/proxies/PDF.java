// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package documentviewer.proxies;

public class PDF extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DocumentViewer.PDF";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		_fileID("_fileID"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size");

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

	public PDF(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DocumentViewer.PDF"));
	}

	protected PDF(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject pDFMendixObject)
	{
		super(context, pDFMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("DocumentViewer.PDF", pDFMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DocumentViewer.PDF");
	}

	/**
	 * @deprecated Use 'PDF.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static documentviewer.proxies.PDF initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return documentviewer.proxies.PDF.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static documentviewer.proxies.PDF initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new documentviewer.proxies.PDF(context, mendixObject);
	}

	public static documentviewer.proxies.PDF load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return documentviewer.proxies.PDF.initialize(context, mendixObject);
	}

	public static java.util.List<documentviewer.proxies.PDF> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<documentviewer.proxies.PDF> result = new java.util.ArrayList<documentviewer.proxies.PDF>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//DocumentViewer.PDF" + xpathConstraint))
			result.add(documentviewer.proxies.PDF.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of _fileID
	 */
	public final java.lang.Long get_fileID()
	{
		return get_fileID(getContext());
	}

	/**
	 * @param context
	 * @return value of _fileID
	 */
	public final java.lang.Long get_fileID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames._fileID.toString());
	}

	/**
	 * Set value of _fileID
	 * @param _fileid
	 */
	public final void set_fileID(java.lang.Long _fileid)
	{
		set_fileID(getContext(), _fileid);
	}

	/**
	 * Set value of _fileID
	 * @param context
	 * @param _fileid
	 */
	public final void set_fileID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long _fileid)
	{
		getMendixObject().setValue(context, MemberNames._fileID.toString(), _fileid);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final documentviewer.proxies.PDF that = (documentviewer.proxies.PDF) obj;
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
		return "DocumentViewer.PDF";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
