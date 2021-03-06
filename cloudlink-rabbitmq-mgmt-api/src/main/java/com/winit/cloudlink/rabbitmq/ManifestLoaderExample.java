package com.winit.cloudlink.rabbitmq;

import com.winit.cloudlink.rabbitmq.loader.ManifestLoader;

/**
 * @author Richard Clayton (Berico Technologies)
 */
public class ManifestLoaderExample {

    public static void main(String[] args) throws Exception {

        // We will load the manifest generated by ManifestExample into a local RabbitMQ broker.

        // XML!
        ManifestLoader.main(new String[]{ "manifests/manifest.xml" });
        ManifestLoader.main(new String[]{ "manifests/manifest.xml", "--rollback" });

        // JSON!
        ManifestLoader.main(new String[]{ "manifests/manifest.json" });
        ManifestLoader.main(new String[]{ "manifests/manifest.json", "--rollback" });

        // YAML!
        ManifestLoader.main(new String[]{ "manifests/manifest.yaml" });
        ManifestLoader.main(new String[]{ "manifests/manifest.yaml", "--rollback" });
    }
}
