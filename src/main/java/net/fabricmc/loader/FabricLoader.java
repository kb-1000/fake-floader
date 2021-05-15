package net.fabricmc.loader;

import net.fabricmc.api.EnvType;
import net.fabricmc.loader.api.MappingResolver;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.entrypoint.EntrypointContainer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quiltmc.loader.impl.QuiltLoaderImpl;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Deprecated
public class FabricLoader implements net.fabricmc.loader.api.FabricLoader {
    private final net.fabricmc.loader.api.FabricLoader delegate = net.fabricmc.loader.api.FabricLoader.getInstance();
    @Deprecated
    public static final FabricLoader INSTANCE = new FabricLoader();
    @Deprecated
    public static final int ASM_VERSION = QuiltLoaderImpl.ASM_VERSION;
    private static final Logger LOG = LogManager.getLogger("FAKE FLOADER");

    static {
        spam();
    }

    private static void spam(String s) {
        LOG.fatal("[OUTDATED API USAGE FIX UR MOD] " + s);
    }

    private static void spam() {
        spam("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        spam("WTF are you doing fix ur mod");
        spam("==================================================");
        spam("Usage of net.fabricmc.loader.FabricLoader found");
        spam("--------------------------------------------------");
        StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
        StringWriter sw = new StringWriter();
        try (PrintWriter pw = new PrintWriter(sw)) {
            new Throwable("usage found here:", null, true, true) {{
                StackTraceElement[] stackTraceElementsCopy = new StackTraceElement[stackTraceElements.length - 1];
                System.arraycopy(stackTraceElements, 1, stackTraceElementsCopy, 0, stackTraceElementsCopy.length);
                setStackTrace(stackTraceElementsCopy);
            }}.printStackTrace(pw);
        }
        Arrays.stream(sw.toString().split("\n")).forEach(FabricLoader::spam);
        spam("--------------------------------------------------");
        spam("==================================================");
        spam("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
    }

    private FabricLoader() {
    }

    @Override
    @Deprecated
    public <T> List<T> getEntrypoints(String key, Class<T> type) {
        spam();
        return delegate.getEntrypoints(key, type);
    }

    @Override
    @Deprecated
    public <T> List<EntrypointContainer<T>> getEntrypointContainers(String key, Class<T> type) {
        spam();
        return delegate.getEntrypointContainers(key, type);
    }

    @Override
    @Deprecated
    public MappingResolver getMappingResolver() {
        spam();
        return delegate.getMappingResolver();
    }

    @Override
    @Deprecated
    public Optional<ModContainer> getModContainer(String id) {
        spam();
        return delegate.getModContainer(id);
    }

    @Override
    @Deprecated
    public Collection<ModContainer> getAllMods() {
        spam();
        return delegate.getAllMods();
    }

    @Override
    @Deprecated
    public boolean isModLoaded(String id) {
        spam();
        return delegate.isModLoaded(id);
    }

    @Override
    @Deprecated
    public boolean isDevelopmentEnvironment() {
        spam();
        return delegate.isDevelopmentEnvironment();
    }

    @Override
    @Deprecated
    public EnvType getEnvironmentType() {
        spam();
        return delegate.getEnvironmentType();
    }

    @Override
    @Deprecated
    public Object getGameInstance() {
        spam();
        return delegate.getGameInstance();
    }

    @Override
    @Deprecated
    public Path getGameDir() {
        spam();
        return delegate.getGameDir();
    }

    @Override
    @Deprecated
    public File getGameDirectory() {
        spam();
        return delegate.getGameDirectory();
    }

    @Override
    @Deprecated
    public Path getConfigDir() {
        spam();
        return delegate.getConfigDir();
    }

    @Override
    @Deprecated
    public File getConfigDirectory() {
        spam();
        return delegate.getConfigDirectory();
    }

    @Override
    @Deprecated
    public String[] getLaunchArguments(boolean sanitize) {
        spam();
        return delegate.getLaunchArguments(sanitize);
    }
}
