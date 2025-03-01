package dev.isxander.controlify.controller.serialization;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import dev.isxander.controlify.controller.ControllerEntity;
import dev.isxander.controlify.controller.ECSComponent;
import org.apache.commons.lang3.SerializationException;

public interface IConfig<T extends ConfigClass> extends ECSComponent {
    T config();

    T defaultConfig();

    JsonElement serialize(Gson gson, ControllerEntity controller) throws SerializationException;

    void deserialize(JsonElement element, Gson gson, ControllerEntity controller) throws SerializationException;

    void resetToDefault();
}
