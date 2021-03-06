package com.futor.content.domain;

import java.util.HashMap;

import org.codehaus.jackson.annotate.JsonIgnore;

import com.futor.utils.DomainConstants;

public class Course extends DomainObject {
	
	//ignore field of Video node::::::::::::::::::::::::::::::::::::
	@JsonIgnore
	private String video_code;
	@JsonIgnore
	private String audio_video_issue;
	@JsonIgnore
	private String editing_issue;
	@JsonIgnore
    private String content_mismatch_issue;
	@JsonIgnore
    private String is_video_deleted;
	@JsonIgnore
    private String tagging_error;
	@JsonIgnore
    private String no_error;
	@JsonIgnore
	private String flag;
	
	
	
	//ignore field of solved example:::::::::::::::::::::::::::::::::::
	@JsonIgnore
	private String SolvedConceptNotes;
	 @JsonIgnore
	 
	 
	 //ignore field of concept node::::::::::::::::::::::::::::::::::::
	  private String complexity_level;
	    @JsonIgnore
	    private String instruction_Duration;
	    @JsonIgnore
	    private String  priority;
	    @JsonIgnore
		private String oldConceptCode;
		@JsonIgnore
		private String learningUnitCode;
		@JsonIgnore
		private String videoCodeStringFromSubjectTable;
		@JsonIgnore
		private String remarks;
	    
	    
	  //ignore field of concept Description::::::::::::::::::::::::::::::::::::::::::
	@JsonIgnore
	private String concept_notes;
	@JsonIgnore
	private String content_url;
	@JsonIgnore
	private String video_url;
	@JsonIgnore
	private String file_path;
	
	//ignore field of content node::::::::::::::::::::::
	@JsonIgnore
	private String studyDuration;
	
	//ignore field of common::::::::::::::::::::::::::::::::::::::::::::::::::::
		@JsonIgnore
		private String objType;
		@JsonIgnore
		private String objectType;
		@JsonIgnore
		private String domain;
		@JsonIgnore
		private String propType;
		@JsonIgnore
		private String solvedConceptNotes;
		@JsonIgnore
		private String objectKey;
		@JsonIgnore
		private String nodeType; 
		@JsonIgnore
		private String key;
		@JsonIgnore
		private String contentType;
		
		
	//ignore subject field:::::::::::::::::
		@JsonIgnore
		private String moveContentStatus;
		
		
		/********for question ********/
		@JsonIgnore
		private String mysqlId;
		@JsonIgnore
		private String base_node_type ;
		@JsonIgnore
		private String source_node_code ;
		@JsonIgnore
		private String question_type = DomainConstants.QUESTION_TYPE_MULTI_CHOICE;
		@JsonIgnore
		private QuestionContent qcontent ;
		
		/*******for RedisQuestionContent***********/

		@JsonIgnore
		private String question_text ;
		@JsonIgnore
		private FutorImage imagePath ;
		@JsonIgnore
		private HashMap<String,QuestionOption> qoptionContent ;
		
		
		/***************  RedisQuestionOptions **************/
		@JsonIgnore
		private int id;
		@JsonIgnore
		private FutorImage imageInfo;
		@JsonIgnore
		private String option_text ;
		@JsonIgnore
		private short isCorrectOption;
		
		/************* RedisFutorImage  ****************/
		@JsonIgnore
		private String url_source ;
		
		/**********adding questionDTO in domain object *********/

		@JsonIgnore
		private Question quesObj ;

}

