package corijpa.study.entityListener.domain;

import jakarta.persistence.*;

public class TestEntityListener {
    @PrePersist
    public void prePersist(Object o) {System.out.println("============= prePersist =============");}

    @PostPersist
    public void postPersist(Object o) {System.out.println("============= postPersist =============");}

    @PreUpdate
    public void preUpdate(Object o) {System.out.println("============= preUpdate =============");}

    @PostUpdate
    public void postUpdate(Object o) {System.out.println("============= postUpdate =============");}

    @PreRemove
    public void preRemove(Object o) {System.out.println("============= preRemove =============");}

    @PostRemove
    public void postRemove(Object o) {System.out.println("============= postRemove =============");}

    @PostLoad
    public void postLoad(Object o) {System.out.println("============= postLoad =============");}
}