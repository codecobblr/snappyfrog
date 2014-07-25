
package org.robovm.bindings.admob;

import org.robovm.apple.coregraphics.CGSize;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.rt.bro.annotation.ByVal;

/** A valid GADAdSize is considered to be one of the predefined GADAdSize constants or a GADAdSize constructed by
 * {@link #getGADAdSize(CGSize)}, {@link #getFullWidthPortrait(float)}, {@link #getFullWidthLandscape(float)}.
 * 
 * To obtain a concrete CGSize, use the function {@link #getCGSize(GADAdSize)}. */
@NativeClass("GADAdSizeWrapped")
public final class GADAdSizeManager extends NSObject {
	private GADAdSizeManager () {
	}

	/** @return iPhone and iPod Touch ad size. Typically 320x50. */
	@Method(selector = "banner")
	public static native @ByVal
	GADAdSize banner ();

	/** @return Medium Rectangle size for the iPad (especially in a UISplitView's left pane). Typically 300x250. */
	@Method(selector = "mediumRectangle")
	public static native @ByVal
	GADAdSize mediumRectangle ();

	/** @return Full Banner size for the iPad (especially in a UIPopoverController or in UIModalPresentationFormSheet). Typically
	 *         468x60. */
	@Method(selector = "fullBanner")
	public static native @ByVal
	GADAdSize fullBanner ();

	/** @return Leaderboard size for the iPad. Typically 728x90. */
	@Method(selector = "leaderboard")
	public static native @ByVal
	GADAdSize leaderboard ();

	/** @return Skyscraper size for the iPad. Mediation only. AdMob/Google does not offer this size. Typically 120x600. */
	@Method(selector = "skyscraper")
	public static native @ByVal
	GADAdSize skyscraper ();

	/** @return An ad size that spans the full width of the application in portrait orientation. The height is typically 50 pixels on
	 *         an iPhone/iPod UI, and 90 pixels tall on an iPad UI. */
	@Method(selector = "smartBannerPortrait")
	public static native @ByVal
	GADAdSize smartBannerPortrait ();

	/** @return An ad size that spans the full width of the application in landscape orientation. The height is typically 32 pixels
	 *         on an iPhone/iPod UI, and 90 pixels tall on an iPad UI. */
	@Method(selector = "smartBannerLandscape")
	public static native @ByVal
	GADAdSize smartBannerLandscape ();

	/** @return Invalid ad size marker. */
	@Method(selector = "invalid")
	public static native @ByVal
	GADAdSize invalid ();

	/** Given a CGSize, return a custom GADAdSize. Use this only if you require a non-standard size, otherwise, use one of the
	 * standard size constants above.
	 * @param size
	 * @return */
	@Method(selector = "fromCGSize:")
	public static native @ByVal
	GADAdSize getGADAdSize (@ByVal CGSize size);

	/** Get a custom GADAdSize that spans the full width of the application in portrait orientation with the height provided.
	 * @param height
	 * @return */
	@Method(selector = "fullWidthPortraitWithHeight:")
	public static native @ByVal
	GADAdSize getFullWidthPortrait (float height);

	/** Get a custom GADAdSize that spans the full width of the application in landscape orientation with the height provided.
	 * @param height
	 * @return */
	@Method(selector = "fullWidthLandscapeWithHeight:")
	public static native @ByVal
	GADAdSize getFullWidthLandscape (float height);

	@Method(selector = "equalToSize:")
	public static native boolean equals (@ByVal GADAdSize size1, @ByVal GADAdSize size2);

	/** Given a GADAdSize constant, returns a {@link CGSize}. If the GADAdSize is unknown, returns {@link CGSize#Zero()}.
	 * @param size
	 * @return */
	@Method(selector = "fromAdSize:")
	public static native @ByVal
	CGSize getCGSize (@ByVal GADAdSize size);

	/** @return {@code true} if size is one of the predefined constants or is a custom GADAdSize generated by
	 *         {@link #getGADAdSize(CGSize)}. */
	@Method(selector = "isValid:")
	public static native boolean isValid (@ByVal GADAdSize size);

	/** @return Given a GADAdSize constant, returns a String describing the GADAdSize. */
	@Method(selector = "toString:")
	public static native String toString (@ByVal GADAdSize size);
}
