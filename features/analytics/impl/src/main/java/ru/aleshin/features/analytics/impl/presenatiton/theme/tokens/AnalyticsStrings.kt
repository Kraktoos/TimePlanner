/*
 * Copyright 2023 Stanislav Aleshin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * imitations under the License.
 */
package ru.aleshin.features.analytics.impl.presenatiton.theme.tokens

import androidx.compose.runtime.staticCompositionLocalOf
import ru.aleshin.core.ui.theme.tokens.TimePlannerLanguage

/**
 * @author Stanislav Aleshin on 30.03.2023.
 */
internal data class AnalyticsStrings(
    val topAppBarTitle: String,
    val menuIconDesc: String,
    val timeTabTitle: String,
    val workLoadTabTitle: String,
    val intelligenceTabTitle: String,
    val weekTimePeriod: String,
    val monthTimePeriod: String,
    val yearTimePeriod: String,
    val timeSelectorTitle: String,
    val refreshAnalyticIconDesc: String,
    val otherAnalyticsName: String,
    val allTimeTitle: String,
    val totalCountTaskTitle: String,
    val totalTimeTaskTitle: String,
    val averageCountTaskTitle: String,
    val averageTimeTaskTitle: String,
    val planningStatisticsTitle: String,
    val otherError: String,
    val halfYearTimePeriod: String,
    val categoryStatisticsTitle: String,
    val executedStatisticsTitle: String
)

internal val russianAnalyticsStrings = AnalyticsStrings(
    topAppBarTitle = "Аналитика",
    menuIconDesc = "Меню",
    timeTabTitle = "Время",
    workLoadTabTitle = "Загруженность",
    intelligenceTabTitle = "Сведения",
    weekTimePeriod = "Неделя",
    monthTimePeriod = "Месяц",
    yearTimePeriod = "Год",
    timeSelectorTitle = "Временной промежуток:",
    refreshAnalyticIconDesc = "Обновить аналитику",
    otherAnalyticsName = "Прочее",
    allTimeTitle = "Всего:",
    totalCountTaskTitle = "Количество\nзадач",
    averageCountTaskTitle = "Число задач\nв день",
    totalTimeTaskTitle = "Общее время\nзадач",
    averageTimeTaskTitle = "Среднее время\nзадачи",
    planningStatisticsTitle = "Статистика планирования",
    otherError = "Ошибка! Обратитесь к разработчику.",
    halfYearTimePeriod = "Полгода",
    categoryStatisticsTitle = "Статистика категорий",
    executedStatisticsTitle = "Статистика выполнения"
)

internal val englishAnalyticsStrings = AnalyticsStrings(
    topAppBarTitle = "Analytics",
    menuIconDesc = "Menu",
    timeTabTitle = "Time",
    workLoadTabTitle = "Workload",
    intelligenceTabTitle = "Information",
    weekTimePeriod = "Week",
    monthTimePeriod = "Month",
    yearTimePeriod = "Year",
    timeSelectorTitle = "Time period:",
    refreshAnalyticIconDesc = "Refresh analytics",
    otherAnalyticsName = "Else",
    allTimeTitle = "Total:",
    totalCountTaskTitle = "Number\nof tasks",
    averageCountTaskTitle = "Number\nof tasks per day",
    totalTimeTaskTitle = "Total time\nof tasks",
    averageTimeTaskTitle = "Average time\nof tasks",
    planningStatisticsTitle = "Planning statistics",
    otherError = "Error! Contact the developer.",
    halfYearTimePeriod = "Half a year",
    categoryStatisticsTitle = "Category statistics",
    executedStatisticsTitle = "Execution statistics"
)

internal val LocalAnalyticsStrings = staticCompositionLocalOf<AnalyticsStrings> {
    error("Analytics Strings is not provided")
}

internal fun fetchAnalyticsStrings(language: TimePlannerLanguage) = when (language) {
    TimePlannerLanguage.EN -> englishAnalyticsStrings
    TimePlannerLanguage.RU -> russianAnalyticsStrings
}
