#!/bin/bash
curl -d "@loan.txt" -H "Content-Type: application/json" -X POST http://localhost:8080/loan