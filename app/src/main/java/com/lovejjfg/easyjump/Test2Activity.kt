/*
 * Copyright (c) 2017.  Joe
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.lovejjfg.easyjump

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.lovejjfg.easyjump.utils.Constants
import kotlinx.android.synthetic.main.activity_content.*

class Test2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("test2 onCreate")
        setContentView(R.layout.activity_content)
        val text = intent.getStringExtra(Constants.TITLE)
        title = text
        content.text = text
    }
}
