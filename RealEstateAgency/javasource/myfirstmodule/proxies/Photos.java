// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Photos extends system.proxies.Image
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Photos";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PublicThumbnailPath("PublicThumbnailPath"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		Photos_Advertisement("MyFirstModule.Photos_Advertisement");

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

	public Photos(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Photos"));
	}

	protected Photos(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject photosMendixObject)
	{
		super(context, photosMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Photos", photosMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Photos");
	}

	/**
	 * @deprecated Use 'Photos.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Photos initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Photos.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Photos initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Photos(context, mendixObject);
	}

	public static myfirstmodule.proxies.Photos load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Photos.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Photos> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Photos> result = new java.util.ArrayList<myfirstmodule.proxies.Photos>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Photos" + xpathConstraint))
			result.add(myfirstmodule.proxies.Photos.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Photos_Advertisement
	 */
	public final myfirstmodule.proxies.Advertisement getPhotos_Advertisement() throws com.mendix.core.CoreException
	{
		return getPhotos_Advertisement(getContext());
	}

	/**
	 * @param context
	 * @return value of Photos_Advertisement
	 */
	public final myfirstmodule.proxies.Advertisement getPhotos_Advertisement(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Advertisement result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Photos_Advertisement.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Advertisement.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Photos_Advertisement
	 * @param photos_advertisement
	 */
	public final void setPhotos_Advertisement(myfirstmodule.proxies.Advertisement photos_advertisement)
	{
		setPhotos_Advertisement(getContext(), photos_advertisement);
	}

	/**
	 * Set value of Photos_Advertisement
	 * @param context
	 * @param photos_advertisement
	 */
	public final void setPhotos_Advertisement(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Advertisement photos_advertisement)
	{
		if (photos_advertisement == null)
			getMendixObject().setValue(context, MemberNames.Photos_Advertisement.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Photos_Advertisement.toString(), photos_advertisement.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Photos that = (myfirstmodule.proxies.Photos) obj;
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
		return "MyFirstModule.Photos";
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
