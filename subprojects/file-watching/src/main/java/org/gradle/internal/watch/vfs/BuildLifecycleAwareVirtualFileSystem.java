/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.internal.watch.vfs;

import org.gradle.internal.vfs.VirtualFileSystem;

import java.io.File;

/**
 * Controls the lifecycle and book-keeping for file system watching.
 */
public interface BuildLifecycleAwareVirtualFileSystem extends VirtualFileSystem {

    /**
     * Called when the build is started.
     */
    void afterBuildStarted(boolean watchingEnabled);

    /**
     * Register a root directory for watching.
     *
     * Adds a directory as a root directory for watching.
     * This method is first called for the root directory of the root project.
     * It is also called for the root directories of included builds, and all other nested builds.
     */
    void registerRootDirectoryForWatching(File rootDirectoryForWatching);

    /**
     * Called when the build is finished.
     */
    void beforeBuildFinished(boolean watchingEnabled);
}
