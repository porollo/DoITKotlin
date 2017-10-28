package com.porollo.doitkotlin.db

import io.realm.Realm
import io.realm.RealmResults

/**
 * Created by Dmitriy S. Porollo on 28.10.2017.
 */

class TaskModel : TaskInterface {

    override fun removeLastTask(realm: Realm) {
        realm.beginTransaction()
        getLastTask(realm).deleteFromRealm()
        realm.commitTransaction()
    }

    override fun addTask(realm: Realm, task: Task): Boolean {
        return try {
            realm.beginTransaction()
            realm.copyToRealmOrUpdate(task)
            realm.commitTransaction()
            true
        } catch (e: Exception) {
            println(e)
            false
        }
    }

    override fun delTask(realm: Realm, id: Int): Boolean {
        return try {
            realm.beginTransaction()
            realm.where(Task::class.java).equalTo("id", id).findFirst()?.deleteFromRealm()
            realm.commitTransaction()
            true
        } catch (e: Exception) {
            println(e)
            false
        }
    }

    override fun editTask(realm: Realm, task: Task): Boolean {
        return try {
            realm.beginTransaction()
            realm.copyToRealm(task)
            realm.commitTransaction()
            true
        } catch (e: Exception) {
            println(e)
            false
        }
    }

    override fun getTask(realm: Realm, taskId: Int): Task {
        return realm.where(Task::class.java).equalTo("id", taskId).findFirst()!! // TODO FixIt
    }

    fun getLastTask(realm: Realm): Task {
        return realm.where(Task::class.java).findAll().last()!!
    }

    fun getStudents(realm: Realm): RealmResults<Task> {
        return realm.where(Task::class.java).findAll()
    }

}