package com.example.androidarchitecturecomponentsandjetpackpractice.mvvm

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideToDoDataBase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        QuoteDatabase::class.java,
        "quote_database"
    )
        .createFromAsset("quotes.db")
        .build()

    @Singleton
    @Provides
    fun provideQuoteDao(quoteDatabase: QuoteDatabase) = quoteDatabase.quoteDao()

}