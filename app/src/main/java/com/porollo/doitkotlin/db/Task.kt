package com.porollo.doitkotlin.db

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass


@RealmClass

open class Task(
        @PrimaryKey
        var id: Long = 0,
        var email: String = "",
        var name: String = "",
        var taskname: String = "",
        var taskcontent: String = "",
        var taskpriority: Int = 0,
        var subtaskscount: Int = 0 ) : RealmObject() {

    fun copy(
            id: Long = this.id,
            email: String = this.email,
            name: String = this.name,
            taskname: String = this.taskname,
            taskcontent: String = this.taskcontent,
            taskpriority: Int = this.taskpriority,
            subtaskscount: Int = this.subtaskscount) = Task(id, email, name, taskname, taskcontent, taskpriority, subtaskscount)
}

