package com.abkris.portfolio.persistence

import androidx.room.*
import com.abkris.portfolio.models.Intestatario
import kotlinx.coroutines.flow.Flow

@Dao
interface IntestatarioDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(intestatario: Intestatario)

    @Update
    fun update()

    @Delete()
    fun deleteIntestatario()

    @Query("SELECT * FROM intestatario_tb")
    fun getAllIntestatario(): Flow<List<Intestatario>>
}