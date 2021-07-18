package com.ringggr.demoitnan.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class UserSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{
                "com.ringggr.demoitnan.entity.User",
                "com.ringggr.demoitnan.entity.Cat"
        };
    }
}
