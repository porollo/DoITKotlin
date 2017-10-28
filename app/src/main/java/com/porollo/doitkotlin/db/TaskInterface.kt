package com.porollo.doitkotlin.db

import io.realm.Realm

/**
 * Created by Dmitriy S. Porollo on 28.10.2017.
 */

interface TaskInterface {

    fun addTask(realm: Realm, task: Task): Boolean
    fun delTask(realm: Realm, id: Int): Boolean
    fun editTask(realm: Realm, task: Task): Boolean
    fun getTask(realm: Realm, taskId: Int): Task
    fun removeLastTask(realm: Realm)

}
