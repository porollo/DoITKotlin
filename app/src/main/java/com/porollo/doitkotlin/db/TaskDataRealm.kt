package com.porollo.doitkotlin.db

import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass


@RealmClass

open class TaskDataRealm {

    @PrimaryKey
    open var id: Long = 0

    open var email: String = ""
    open var name: String = ""

    open var taskname: String = ""
    open var taskcontent: String = ""
    open var taskpriority: Int = 0
    open var subtaskscount: Int = 0

}
