package ru.ad4.svoyak.loaders.chgk;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import ru.ad4.svoyak.App;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
@IntegrationTest
public class ChgkLoaderIntTest {

    @Inject
    private ChgkLoader chgkLoader;

    @Test
    public void testChgkLoader() {
        boolean loadAndSave = chgkLoader.load();
        Assert.assertEquals(loadAndSave, true);
    }
}
