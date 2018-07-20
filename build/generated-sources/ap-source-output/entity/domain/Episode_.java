package entity.domain;

import entity.domain.Question;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-19T21:53:44")
@StaticMetamodel(Episode.class)
public class Episode_ { 

    public static volatile SingularAttribute<Episode, String> name;
    public static volatile ListAttribute<Episode, Question> questions;
    public static volatile SingularAttribute<Episode, Long> id;

}