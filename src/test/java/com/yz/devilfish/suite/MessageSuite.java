package com.yz.devilfish.suite;

import com.yz.devilfish.mock.MessageTest;
import com.yz.devilfish.service.MessageServiceTest;
import com.yz.devilfish.web.MessageController;
import com.yz.devilfish.web.MessageControllerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by kyuan on 2017/7/10.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        MessageControllerTest.class,
        MessageServiceTest.class
})
public class MessageSuite {

}
