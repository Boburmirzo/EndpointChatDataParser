package ru.task.snapengageEndpoint.mapper;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.task.snapengageEndpoint.datatransferobject.RequestDTO;
import ru.task.snapengageEndpoint.utils.SampleJson;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RequestParserTest {
    private static org.slf4j.Logger LOG = LoggerFactory.getLogger(RequestParserTest.class);

    @Before
    public void initiate(){

    }

    @Test
    public void makeRequestDTOFromJsonStringTest(){
        LOG.info("Test make RequestDTO from a Json sample string");
        RequestDTO requestDTO = RequestParser.makeRequestDTOFromJsonString(SampleJson.FULL_REQUEST_SAMPLE);
        assertNotNull(requestDTO);
        assertNotNull(requestDTO.getPlugins());
        assertNotNull(requestDTO.getRequesterDetailsDTO());
        assertNotNull(requestDTO.getTranscripts());
        assertNotNull(requestDTO.getOperatorVariableDTOS());
        assertEquals("e8175843-d381-4d7c-aa9f-0da1610ad1b", requestDTO.getWidgetId());
        assertEquals("test@example.com", requestDTO.getRequesterDetailsDTO().getEmails().get(0));
    }
}
