package com.online.skystar.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Settings
import androidx.lifecycle.ViewModel
import com.online.skystar.models.DashboardStat
import kotlinx.coroutines.flow.MutableStateFlow
import androidx.compose.ui.graphics.Color
import com.online.skystar.models.QuickAction
import kotlinx.coroutines.flow.StateFlow



class DashboardViewModel: ViewModel(){

    val _stats= MutableStateFlow(
        listOf(
            DashboardStat("Revenue","12000", Icons.Default.Phone,Color.Magenta),
            DashboardStat("User","1456", Icons.Default.Person,Color.Cyan)
        )
    )
    val stats: StateFlow<List<DashboardStat>>get()=_stats
    private val _quickAction=MutableStateFlow(
        listOf(
            QuickAction("Add new user", Icons.Default.Person),
            QuickAction("Generate report", Icons.Default.AccountCircle),
            QuickAction("setting", Icons.Default.Settings),
        )
    )
    val quickAction: StateFlow<List<QuickAction>>get() =_quickAction

}