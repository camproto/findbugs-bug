package test;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.layout.AbstractStringLayout;
import org.apache.logging.log4j.core.layout.JsonLayout;

import java.nio.charset.Charset;

public class FindbugIAEs extends AbstractStringLayout {

    private final JsonLayout logDataLayout;

    private FindbugIAEs(Configuration config, Charset aCharset,
                        Serializer headerSerializer, Serializer footerSerializer) {
        super(config, aCharset, headerSerializer, footerSerializer);

        logDataLayout = JsonLayout.createDefaultLayout();
    }

    @Override
    public String toSerializable(LogEvent event) {

        return logDataLayout.toSerializable(event);
    }
}
