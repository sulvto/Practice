package me.qinchao.example.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by sulvto on 2/13/19.
 */
@Entity
public class Permission {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    @Column(columnDefinition = "enum('menu','button')")
    private String resourceType;
    private String url;
    private String permission;
    private long parentId;
    private String parentIds;
    private boolean available = false;
    @ManyToMany
    @JoinTable(name = "RolePermission", joinColumns = {@JoinColumn(name="permissionId")}, inverseJoinColumns = {@JoinColumn(name = "roleId")})
    private List<Role> roleList;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
}
