// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.MirrorSequences
{
    using System.Threading.Tasks;
   using Models;

    /// <summary>
    /// Extension methods for SequenceRequestResponseTest.
    /// </summary>
    public static partial class SequenceRequestResponseTestExtensions
    {
            /// <summary>
            /// Creates a new pet in the store.  Duplicates are allowed
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='pets'>
            /// Pets to add to the store
            /// </param>
            public static System.Collections.Generic.IList<Pet> AddPet(this ISequenceRequestResponseTest operations, System.Collections.Generic.IList<Pet> pets)
            {
                return System.Threading.Tasks.Task.Factory.StartNew(s => ((ISequenceRequestResponseTest)s).AddPetAsync(pets), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None, System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Creates a new pet in the store.  Duplicates are allowed
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='pets'>
            /// Pets to add to the store
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task<System.Collections.Generic.IList<Pet>> AddPetAsync(this ISequenceRequestResponseTest operations, System.Collections.Generic.IList<Pet> pets, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                using (var _result = await operations.AddPetWithHttpMessagesAsync(pets, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Adds new pet stylesin the store.  Duplicates are allowed
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='petStyle'>
            /// Pet style to add to the store
            /// </param>
            public static System.Collections.Generic.IList<int?> AddPetStyles(this ISequenceRequestResponseTest operations, System.Collections.Generic.IList<int?> petStyle)
            {
                return System.Threading.Tasks.Task.Factory.StartNew(s => ((ISequenceRequestResponseTest)s).AddPetStylesAsync(petStyle), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None, System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Adds new pet stylesin the store.  Duplicates are allowed
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='petStyle'>
            /// Pet style to add to the store
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task<System.Collections.Generic.IList<int?>> AddPetStylesAsync(this ISequenceRequestResponseTest operations, System.Collections.Generic.IList<int?> petStyle, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                using (var _result = await operations.AddPetStylesWithHttpMessagesAsync(petStyle, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Updates new pet stylesin the store.  Duplicates are allowed
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='petStyle'>
            /// Pet style to add to the store
            /// </param>
            public static System.Collections.Generic.IList<int?> UpdatePetStyles(this ISequenceRequestResponseTest operations, System.Collections.Generic.IList<int?> petStyle)
            {
                return System.Threading.Tasks.Task.Factory.StartNew(s => ((ISequenceRequestResponseTest)s).UpdatePetStylesAsync(petStyle), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None, System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Updates new pet stylesin the store.  Duplicates are allowed
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='petStyle'>
            /// Pet style to add to the store
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task<System.Collections.Generic.IList<int?>> UpdatePetStylesAsync(this ISequenceRequestResponseTest operations, System.Collections.Generic.IList<int?> petStyle, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                using (var _result = await operations.UpdatePetStylesWithHttpMessagesAsync(petStyle, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

    }
}
