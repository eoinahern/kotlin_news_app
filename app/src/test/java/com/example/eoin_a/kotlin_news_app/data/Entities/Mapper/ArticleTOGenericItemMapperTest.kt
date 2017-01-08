package com.example.eoin_a.kotlin_news_app.data.Entities.Mapper

import android.content.Context
import org.junit.Assert
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

/**
 * Created by eoin_a on 05/01/2017.
 */
class ArticleTOGenericItemMapperTest {

    @Mock var  cont : Context? = null


    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)

    }

    @Test
    fun testNotNullCont()
    {
        Assert.assertNotNull(cont)
    }

}