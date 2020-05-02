package com.abkris.portfolio.persistence

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "intestatari")
data class Intestatario(
    @PrimaryKey(autoGenerate = true)    val id:Int,
    @ColumnInfo(name = "nome")          val nome: String,
    @ColumnInfo(name = "cognome")       val cognome: String,
    @ColumnInfo(name ="iban")           val iban:String) {

}