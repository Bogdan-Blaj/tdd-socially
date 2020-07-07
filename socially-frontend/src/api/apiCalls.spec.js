import React from 'react';
import axios from 'axios';
import * as apiCalls from './apiCalls';

describe('apiCalls', () => {
    describe('signup', () => {
        it('calls /api/1.0/users', () => {
            const mockSignup = jest.fn();

            axios.post = mockSignup;
            apiCalls.signup();

            const path = mockSignup.mock.calls[0][0]; //the first call and the first returned parameter
            expect(path).toBe('/api/1.0/users');
        });
    });
});