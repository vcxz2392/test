package corijpa.study.entityListener.domain;

import jakarta.persistence.*;
import lombok.*;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners({TestEntityListener.class})// ㅣㅑㄴ
public class Player {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Integer backNumber;

    private String aaa;

//    @PrePersist
//    public void prePersist() {System.out.println("============= prePersist =============");}
//
//    @PostPersist
//    public void postPersist() {System.out.println("============= postPersist =============");}
//
//    @PreUpdate
//    public void preUpdate() {System.out.println("============= preUpdate =============");}
//
//    @PostUpdate
//    public void postUpdate() {System.out.println("============= postUpdate =============");}
//
//    @PreRemove
//    public void preRemove() {System.out.println("============= preRemove =============");}
//
//    @PostRemove
//    public void postRemove() {System.out.println("============= postRemove =============");}
//
//    @PostLoad
//    public void postLoad() {System.out.println("============= postLoad =============");}

}
