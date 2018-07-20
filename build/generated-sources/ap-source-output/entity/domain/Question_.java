package entity.domain;

import entity.domain.Episode;
import entity.domain.PublicFigure;
import entity.domain.QuestionPoint;
import entity.domain.QuestionSubject;
import entity.domain.Stage;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-19T21:53:44")
@StaticMetamodel(Question.class)
public class Question_ { 

    public static volatile SingularAttribute<Question, QuestionSubject> questionSubject;
    public static volatile SingularAttribute<Question, PublicFigure> publicFigure;
    public static volatile SingularAttribute<Question, String> trueFalseCorrectAnswer;
    public static volatile SingularAttribute<Question, QuestionPoint> questionPoint;
    public static volatile SingularAttribute<Question, Episode> episode;
    public static volatile SingularAttribute<Question, String> multipleCorrectAnswer;
    public static volatile SingularAttribute<Question, String> content;
    public static volatile SingularAttribute<Question, String> hide;
    public static volatile SingularAttribute<Question, String> video_image_none;
    public static volatile SingularAttribute<Question, Stage> stage;
    public static volatile SingularAttribute<Question, String> multipleTrueFalseDirectAnswer;
    public static volatile SingularAttribute<Question, String> imageVideoPath;
    public static volatile SingularAttribute<Question, String> option3;
    public static volatile SingularAttribute<Question, String> option1;
    public static volatile SingularAttribute<Question, Long> id;
    public static volatile SingularAttribute<Question, String> option2;
    public static volatile SingularAttribute<Question, String> directAnswer;

}