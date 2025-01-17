/*
 * Copyright (c) 2006, 2021 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Oracle - initial API and implementation
//
package org.eclipse.persistence.jpa.jpql.tools.model.query;

/**
 * This visitor allows a subclass to simply override {@link #visit(StateObject)} and perform the
 * same task for all visited {@link StateObject ItateObjects}.
 *
 * @version 2.4
 * @since 2.4
 * @author Pascal Filion
 */
public abstract class AnonymousStateObjectVisitor implements StateObjectVisitor {

    @Override
    public void visit(AbsExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(AbstractSchemaNameStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(AdditionExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(AllOrAnyExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(AndExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(ArithmeticFactorStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(AvgFunctionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(BadExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(BetweenExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(CaseExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(CoalesceExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(CollectionMemberDeclarationStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(CollectionMemberExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(CollectionValuedPathExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(ComparisonExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(ConcatExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(ConstructorExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(CountFunctionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(DateTimeStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(DeleteClauseStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(DeleteStatementStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(DerivedPathIdentificationVariableDeclarationStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(DerivedPathVariableDeclarationStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(DivisionExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(EmptyCollectionComparisonExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(EntityTypeLiteralStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(EntryExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(EnumTypeStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(ExistsExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(FromClauseStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(FunctionExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(GroupByClauseStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(HavingClauseStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(IdentificationVariableDeclarationStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(IdentificationVariableStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(IndexExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(InExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(InputParameterStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(JoinStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(JPQLQueryStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(KeyExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(KeywordExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(LengthExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(LikeExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(LocateExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(LowerExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(MaxFunctionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(MinFunctionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(ModExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(MultiplicationExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(NotExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(NullComparisonExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(NullIfExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(NumericLiteralStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(ObjectExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(OrderByClauseStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(OrderByItemStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(OrExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(RangeVariableDeclarationStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(ResultVariableStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(SelectClauseStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(SelectStatementStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(SimpleFromClauseStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(SimpleSelectClauseStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(SimpleSelectStatementStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(SizeExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(SqrtExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(StateFieldPathExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    /**
     * Blindly visit the given {@link StateObject}.
     *
     * @param stateObject The {@link StateObject} to visit
     */
    protected void visit(StateObject stateObject) {
    }

    @Override
    public void visit(StringLiteralStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(SubExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(SubstringExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(SubtractionExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(SumFunctionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(TreatExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(TrimExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(TypeExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(UnknownExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(UpdateClauseStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(UpdateItemStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(UpdateStatementStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(UpperExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(ValueExpressionStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(WhenClauseStateObject stateObject) {
        visit((StateObject) stateObject);
    }

    @Override
    public void visit(WhereClauseStateObject stateObject) {
        visit((StateObject) stateObject);
    }
}
