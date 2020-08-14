package controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * TestRequestBean
 *
 * @author dailson
 * @since 2 de ago de 2020
 */
@Named
@RequestScoped
public class TestRequestBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private String[] category;
	private List<String> categories;
	private List<String> categorySelected = new ArrayList<>();


	@PostConstruct
	public void init() {
		System.out.println("Entered the PostConstruct");
		category = new String[] { "c1", "c2", "c3", "c4" };
		categories = Arrays.asList(category);
	}
	
	public void selectCategory() {
		int index = ThreadLocalRandom.current().nextInt(4);
		String text = categories.get(index);
		categorySelected.add(text);
	}

	/**
	 * @return the category
	 */
	public String[] getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String[] category) {
		this.category = category;
	}

	/**
	 * @return the categories
	 */
	public List<String> getCategories() {
		return categories;
	}

	/**
	 * @param categories the categories to set
	 */
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	/**
	 * @return the categorySelected
	 */
	public List<String> getCategorySelected() {
		return categorySelected;
	}

	/**
	 * @param categorySelected the categorySelected to set
	 */
	public void setCategorySelected(List<String> categorySelected) {
		this.categorySelected = categorySelected;
	}
	

}
