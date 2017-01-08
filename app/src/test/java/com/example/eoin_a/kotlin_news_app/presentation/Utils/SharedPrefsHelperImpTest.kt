package com.example.eoin_a.kotlin_news_app.presentation.Utils

import android.content.Context
import android.content.SharedPreferences
import org.junit.Assert
import org.junit.Before

import org.junit.Assert.*
import org.junit.BeforeClass
import org.junit.Test
import org.mockito.ArgumentMatchers.anyInt
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify


/**
 * Created by eoin_a on 08/01/2017.
 */
class SharedPrefsHelperImpTest {

    @Mock var  cont : Context? = null
    @Mock var mockprefs : SharedPreferences? = null
    @Mock var mockprefsedit : SharedPreferences.Editor? = null
    var prefshelper : SharedPrefsHelper? = null

    @Before
    fun setUp() {

        //MockitoAnnotations.initMocks(this)
        cont = Mockito.mock(Context::class.java)
        mockprefs = Mockito.mock(SharedPreferences::class.java)
        mockprefsedit = Mockito.mock(SharedPreferences.Editor::class.java)

        `when`(cont!!.getSharedPreferences(anyString(), anyInt())).thenReturn(mockprefs!!)
        `when`(mockprefs!!.edit()).thenReturn(mockprefsedit!!)

        prefshelper = SharedPrefsHelperImp(cont!!)
    }

    @Test
    fun testNotNull(){
        Assert.assertNotNull(cont)
        Assert.assertNotNull(mockprefs)
        Assert.assertNotNull(mockprefsedit)
    }

    @Test
    fun testItemAdded()
    {
        prefshelper!!.addPrefsStringVal("thing", "thing")
        verify(mockprefsedit)!!.putString(anyString(), anyString())
    }

    @Test
    fun testGetString()
    {
        prefshelper!!.getPrefsStringValue("key")
        verify(mockprefs)!!.getString("key", "")
    }

}