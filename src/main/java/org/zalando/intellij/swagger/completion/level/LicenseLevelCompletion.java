package org.zalando.intellij.swagger.completion.level;

import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.completion.InsertHandler;
import com.intellij.codeInsight.lookup.LookupElement;
import org.jetbrains.annotations.NotNull;
import org.zalando.intellij.swagger.completion.traversal.PositionResolver;

import static org.zalando.intellij.swagger.completion.style.CompletionStyleFactory.optional;
import static org.zalando.intellij.swagger.completion.style.CompletionStyleFactory.required;

class LicenseLevelCompletion extends LevelCompletion {

    LicenseLevelCompletion(final PositionResolver positionResolver, final CompletionResultSet completionResultSet) {
        super(positionResolver, completionResultSet);
    }

    public void fill(@NotNull final InsertHandler<LookupElement> insertHandler) {
        addUnique("name", required(positionResolver), insertHandler);
        addUnique("url", optional(positionResolver), insertHandler);
    }

}
