package com.porollo.doitkotlin.db

import io.realm.Realm

/**
 * Created by Dmitriy S. Porollo on 28.10.2017.
 */

interface TaskDataInterface {

    fun addTask(realm: Realm, task: TaskDataRealm): Boolean
    fun delTask(realm: Realm, id: Int): Boolean
    fun editTask(realm: Realm, task: TaskDataRealm): Boolean
    fun getTask(realm: Realm, taskId: Int): TaskDataRealm
    fun removeLastTask(realm: Realm)

}
