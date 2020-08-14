package model.entities;

import java.io.Serializable;

/**
 * Task
 *
 * @author dailson
 * @since 25 de jul de 2020
 */
public class Task implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
