package com.shopapp.data.database.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100\u000fH'J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100\u000fH'J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u0013\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u00a7@\u00a2\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010\u0018\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J(\u0010\u001a\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u00a7@\u00a2\u0006\u0002\u0010\u001f\u00a8\u0006 "}, d2 = {"Lcom/shopapp/data/database/dao/CategoryDao;", "", "deleteCategory", "", "category", "Lcom/shopapp/data/database/entity/CategoryEntity;", "(Lcom/shopapp/data/database/entity/CategoryEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCategoryById", "categoryId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActiveCategoryCount", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllActiveCategories", "Lkotlinx/coroutines/flow/Flow;", "", "getAllCategories", "getCategoryById", "insertCategories", "categories", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCategory", "searchCategories", "searchQuery", "updateCategory", "updateCategoryStatus", "isActive", "", "updatedAt", "", "(Ljava/lang/String;ZJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
@androidx.room.Dao()
public abstract interface CategoryDao {
    
    @androidx.room.Query(value = "SELECT * FROM categories WHERE category_id = :categoryId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCategoryById(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.shopapp.data.database.entity.CategoryEntity> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM categories WHERE is_active = 1 ORDER BY sort_order ASC, name ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.database.entity.CategoryEntity>> getAllActiveCategories();
    
    @androidx.room.Query(value = "SELECT * FROM categories ORDER BY sort_order ASC, name ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.database.entity.CategoryEntity>> getAllCategories();
    
    @androidx.room.Query(value = "SELECT * FROM categories WHERE name LIKE '%' || :searchQuery || '%' AND is_active = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchCategories(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.shopapp.data.database.entity.CategoryEntity>> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertCategory(@org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.entity.CategoryEntity category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertCategories(@org.jetbrains.annotations.NotNull()
    java.util.List<com.shopapp.data.database.entity.CategoryEntity> categories, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateCategory(@org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.entity.CategoryEntity category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteCategory(@org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.entity.CategoryEntity category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM categories WHERE category_id = :categoryId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteCategoryById(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE categories SET is_active = :isActive, updated_at = :updatedAt WHERE category_id = :categoryId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateCategoryStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryId, boolean isActive, long updatedAt, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM categories WHERE is_active = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getActiveCategoryCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}