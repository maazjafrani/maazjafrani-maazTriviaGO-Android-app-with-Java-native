package com.example.triviago;

public class CategoryModel {
    private String categoryId,CategoryName, CategoryImage; //setting all the variables


    //below is the Constructor:
    public CategoryModel(String categoryId, String categoryName, String categoryImage) {
        this.categoryId = categoryId;
        this.CategoryName = categoryName;
        this.CategoryImage = categoryImage;
    }

    //below is the empty constructor for Fire Base:
    public CategoryModel(){}


    //Below are all the setters and getters:
    public String getCategoryId() {
        return categoryId;
    }


    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getCategoryImage() {
        return CategoryImage;
    }

    public void setCategoryImage(String categoryImage) {
        CategoryImage = categoryImage;
    }


}
