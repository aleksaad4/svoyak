package ru.ad4.svoyak.data.entities

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

enum class SourceType {
    DB_CHGK_INFO
}

@Entity
data class Tour(
        var name: String = "",
        var sourceType: SourceType = SourceType.DB_CHGK_INFO,

        @Id @GeneratedValue
        var id: Long = 0,

        @Transient
        var topicList: List<Topic> = ArrayList<Topic>()
)

@Entity
data class Topic(
        var name: String = "",
        var tourId: Long = 0,

        @Id @GeneratedValue
        var id: Long = 0,

        @Transient
        var questionList: List<Question> = ArrayList<Question>()
)

@Entity
data class Question(
        var text: String = "",
        var topicId: Long = 0,

        @Id @GeneratedValue
        var id: Long = 0,

        @Transient
        var answerList: List<Answer> = ArrayList<Answer>()
)


@Entity
data class Answer(
        var text: String = "",
        var moderated: Boolean = false,
        var questionId: Long = 0,

        @Id @GeneratedValue
        var id: Long = 0
)