package com.example.structurepatterns

import java.lang.IllegalArgumentException
import javax.sql.DataSource

interface Datasource
class Databasedatasource:Datasource
class NetworkdtaSource:Datasource
abstract class DataSourceFactory{
    abstract fun makeDataSource():Datasource
    companion object{
        inline fun <reified T:Datasource> createFactory():DataSourceFactory=
            when(T::class){
                Databasedatasource::class->DatabaseFactory()
                NetworkdtaSource::class->NetworkFactory()
                else-> throw IllegalArgumentException()
            }
    }
}
class NetworkFactory:DataSourceFactory(){
    override fun makeDataSource(): Datasource =NetworkdtaSource()

}
class DatabaseFactory:DataSourceFactory(){
    override fun makeDataSource(): Datasource= Databasedatasource()

}

fun main(){
    val dataSourceFactory:DataSourceFactory= DataSourceFactory.createFactory<Databasedatasource>()
    val datasource:Datasource=dataSourceFactory.makeDataSource()
    println(datasource::class)
}