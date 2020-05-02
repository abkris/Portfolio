package com.abkris.portfolio.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "intestatario_tb")
data class Intestatario(
    @PrimaryKey(autoGenerate = true)        val id:Int,
    @ColumnInfo(name = "nome")              val nome: String,
    @ColumnInfo(name = "cognome")           val cognome: String,
    @ColumnInfo(name = "codice_fiscale")    val codiceFiscale:String,
    @ColumnInfo(name = "numero_telefono")   val numeroTelefono: String,
    @ColumnInfo(name = "email")             val email: String){
}