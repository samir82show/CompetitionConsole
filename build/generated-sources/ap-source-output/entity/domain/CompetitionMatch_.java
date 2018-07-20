package entity.domain;

import entity.domain.Episode;
import entity.domain.School;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-19T21:53:44")
@StaticMetamodel(CompetitionMatch.class)
public class CompetitionMatch_ { 

    public static volatile SingularAttribute<CompetitionMatch, Integer> score2;
    public static volatile SingularAttribute<CompetitionMatch, School> school2;
    public static volatile SingularAttribute<CompetitionMatch, School> school1;
    public static volatile SingularAttribute<CompetitionMatch, Episode> episode;
    public static volatile SingularAttribute<CompetitionMatch, Long> id;
    public static volatile SingularAttribute<CompetitionMatch, Integer> score1;
    public static volatile SingularAttribute<CompetitionMatch, Integer> status;

}