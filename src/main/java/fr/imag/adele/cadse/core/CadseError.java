package fr.imag.adele.cadse.core;

import java.text.MessageFormat;

import fr.imag.adele.cadse.core.util.NLS;

/**
 * Represents an exception thrown by CADSE runtime.
 * 
 * @author Thomas
 * 
 */
public class CadseError {

	private String				_msg;
	private Object[]			_args;

	/* 
	 * type : 
	 * warning (can commit)
	 * error (can commit)
	 * fail (cannot commit)
	 * */

	/**
	 * Creates a CADSE error.
	 * 
	 * @param message
	 *            error message
	 * @param args
	 *            arguments used to format error message
	 */
	public CadseError(String msg, Object... args) {
		_msg = msg;
		_args = args;
	}

	public Object[] getArgs() {
		return _args;
	}

	public String getMsg() {
		return _msg;
	}
	
	public String getMessage() {
		return NLS.bind(_msg, _args);
	}
}
