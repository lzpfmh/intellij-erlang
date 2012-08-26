// This is a generated file. Not intended for manual editing.
package org.intellij.erlang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;

public interface ErlangRecordExpression extends ErlangExpression {

  @Nullable
  ErlangExpression getExpression();

  @Nullable
  ErlangQAtom getQAtom();

  @Nullable
  ErlangRecordRef getRecordRef();

  @Nullable
  ErlangRecordTuple getRecordTuple();

  @Nullable
  PsiReference getReference();

}
