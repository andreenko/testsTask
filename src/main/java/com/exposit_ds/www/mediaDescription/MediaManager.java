package com.exposit_ds.www.mediaDescription;

import com.exposit_ds.www.catalogDescription.Catalog;

public interface MediaManager<T> {

    boolean add(T media);

    boolean delete(String name, Catalog currentCatalog);

    boolean show(Catalog catalog);

    boolean addFavorites(String name, Catalog currentCatalog);

    boolean showFavorites();

    boolean deleteFavorites(String name, Catalog currentCatalog);

    boolean search(MediaResource media, boolean isStrict);

    MediaResource findForEdit(String name, Catalog currentCatalog);
}
