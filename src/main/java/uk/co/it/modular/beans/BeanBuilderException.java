
package uk.co.it.modular.beans;

/**
 * @author Stewart Bissett
 * 
 * @deprecated Moved to {@link org.exparity.test.builder.BeanBuilderException}
 */
@Deprecated
public class BeanBuilderException extends RuntimeException {

	private static final long serialVersionUID = 3815822809921345204L;

	public BeanBuilderException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public BeanBuilderException(final String message) {
		super(message);
	}

}
