package io.github.jetkai.openai.api.impl.model;

import io.github.jetkai.openai.api.data.model.ModelData;

import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * ModelBuilderImpl
 *
 * @author <a href="https://github.com/jetkai">Kai</a>
 * @version 1.0.1
 * {@code - 05/03/2023}
 * @since 1.0.0
 * {@code - 05/03/2023}
 */
@SuppressWarnings("unused")
public class ModelBuilderImpl implements ModelData.Builder {
    
    String id; //text-babbage:001
    String object; //model
    int created; //1642018370
    String ownedBy; //openai
    String root; //text-babbage:001
    String parent; //null
    List<ModelPermissionsImpl> permission;

    public ModelBuilderImpl() { }

    @Override
    public ModelBuilderImpl setId(String id) {
        requireNonNull(id);
        this.id = id;
        return this;
    }

    @Override
    public ModelBuilderImpl setCreated(int created) {
        requireNonNull(created);
        this.created = created;
        return this;
    }

    @Override
    public ModelBuilderImpl setObject(String object) {
        requireNonNull(object);
        this.object = object;
        return this;
    }

    @Override
    public ModelBuilderImpl setParent(String parent) {
        requireNonNull(parent);
        this.parent = parent;
        return this;
    }

    @Override
    public ModelBuilderImpl setOwnedBy(String ownedBy) {
        requireNonNull(ownedBy);
        this.ownedBy = ownedBy;
        return this;
    }

    @Override
    public ModelBuilderImpl setRoot(String root) {
        requireNonNull(root);
        this.root = root;
        return this;
    }

    @Override
    public ModelBuilderImpl setPermissions(List<ModelPermissionsImpl> permission) {
        requireNonNull(permission);
        this.permission = permission;
        return this;
    }

    @Override
    public ModelData build() {
        return ModelImpl.create(this);
    }

}