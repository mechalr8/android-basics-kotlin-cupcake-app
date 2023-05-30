package com.example.cupcake

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.cupcake.model.OrderViewModel
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class ViewModelTests {
    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Test
    fun quantity_twelve_cupcakes(){
        val orderViewModel: OrderViewModel = OrderViewModel()
        orderViewModel.quantity.observeForever {  }
        orderViewModel.setQuantity(12)
        assertEquals(12, orderViewModel.quantity.value)
    }

    @Test
    fun price_twelve_cupcakes(){
        val orderViewModel: OrderViewModel = OrderViewModel()
        orderViewModel.price.observeForever {  }
        orderViewModel.setQuantity(12)
        assertEquals("₹27.00", orderViewModel.price.value)
    }
}